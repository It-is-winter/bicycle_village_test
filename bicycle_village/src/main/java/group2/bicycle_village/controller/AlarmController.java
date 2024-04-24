package group2.bicycle_village.controller;

import group2.bicycle_village.common.dto.AlarmDTO;
import group2.bicycle_village.service.AlarmService;
import group2.bicycle_village.service.AlarmServiceImpl;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

public class AlarmController implements RestController {
    private AlarmService service = new AlarmServiceImpl();

    /**
     * 팔로우한 사용자가 게시글을 올렸는지 체크
     */
    public void boardCheck(HttpServletRequest req, HttpServletResponse res) throws IOException {
        HttpSession session = req.getSession();
        session.setAttribute("insertBoard",1);

        insertAlarm(req, res);
    }

    /**
     * 팔로우한 사용자가 게시글을 올렸을 때 알림테이블에 알림 등록
     */
    public void insertAlarm(HttpServletRequest req, HttpServletResponse res) throws IOException {
        //세션에서 현재 로그인하고 있는 사용자 정보 얻어오기
        //String Id = req.getParameter("Id");
        System.out.println("insert alarm");
        int result = 0;
        int insertBoard = 1;
        if (insertBoard != 0) {
            try {
                result = service.insertAlarm("12", new AlarmDTO("알림생성", 0, "/index.jsp"));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        PrintWriter out = res.getWriter();
        out.println(result);
        System.out.println("insertAlarm result: " + result);
    }
}
