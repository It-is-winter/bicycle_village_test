package group2.bicycle_village.controller;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;

@WebServlet(urlPatterns = "/front", loadOnStartup = 1)
public class DispatcherServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    Map<String, Controller> conMap;
    Map<String, Class<?>> conClzMap;
    @Override
    public void init(ServletConfig config) throws ServletException {

        ServletContext application = config.getServletContext();
        Object obj = application.getAttribute("conMap");
        conMap = (Map<String, Controller>)obj;

        conClzMap = (Map<String, Class<?>>)config.getServletContext().getAttribute("conClzMap");

    }

    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String key = request.getParameter("key"); //customer
        String methodName = request.getParameter("methodName"); //idCheck , insert , selectAll

        System.out.println("key = " + key+", methodName = " + methodName);
        try {
            Class<?> clz = conClzMap.get(key);
            Method method = clz.getMethod(methodName, HttpServletRequest.class , HttpServletResponse.class);

            Controller controller = conMap.get(key);
            ModelAndView mv = (ModelAndView) method.invoke(controller, request , response);

            if(mv.isRedirect()) {
                response.sendRedirect(mv.getViewName());
            } else {
                request.getRequestDispatcher(mv.getViewName()).forward(request, response);
            }

        }catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("error", e.getCause().getMessage());
            request.getRequestDispatcher("/error.jsp").forward(request, response);
        }
    }//service 메소드 끝
}
