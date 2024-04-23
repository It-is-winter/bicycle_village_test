package group2.bicycle_village.common.listener;

import group2.bicycle_village.controller.Controller;
import group2.bicycle_village.controller.RestController;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

@WebListener
public class HandlerMappingListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        Map<String, RestController> map = new HashMap<String, RestController>();
        Map<String, Class<?> > clzMap = new HashMap<String, Class<?>>();
        Map<String, Controller> conMap = new HashMap<String, Controller>();
        Map<String, Class<?>> conClzMap = new HashMap<>();

        ResourceBundle rb = ResourceBundle.getBundle("restController");
        ResourceBundle crb = ResourceBundle.getBundle("controller");

        try {
            for(String key : rb.keySet()) {
                String value = rb.getString(key);
                Class<?> className = Class.forName(value);
                RestController controller = (RestController)className.getDeclaredConstructor().newInstance();
                map.put(key, controller);
                clzMap.put(key, className);
            }
        }catch (Exception ex) {
            ex.printStackTrace();
        }

        try {
            for(String key : crb.keySet()) {
                String value = crb.getString(key);
                Class<?> className = Class.forName(value);
                Controller controller = (Controller)className.getDeclaredConstructor().newInstance();
                conMap.put(key, controller);
                conClzMap.put(key, className);
            }
        }catch (Exception ex) {
            ex.printStackTrace();
        }

        //모든 영역에서 map을 사용할수 있도록 ServletContext영역에 저장한다.
        ServletContext application = sce.getServletContext();
        application.setAttribute("restMap", map);
        application.setAttribute("restClzMap", clzMap);
        application.setAttribute("conMap", conMap);
        application.setAttribute("conClzMap", conClzMap);

    }
}
