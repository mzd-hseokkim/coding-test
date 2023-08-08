package kr.co.mz.b2b.codingtest.jee.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * 다음은 간단한 LoginServlet 코드입니다. 코드에는 문제가 있는 부분이 있습니다. 그 부분을 찾아서 설명하세요.
 * TODO [[ 어떤 문제가 있는지 여기에 설명하세요. ]]
 * <p>
 * 제한시간 : 5분
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    private String username;  // 사용자 이름
    private String password;  // 비밀번호

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        username = req.getParameter("username");
        password = req.getParameter("password");

        // DB나 다른 서비스를 사용하여 사용자 인증 절차
        if (authenticate(username, password)) {
            resp.getWriter().write("Login successful!");
        } else {
            resp.getWriter().write("Login failed!");
        }
    }

    private boolean authenticate(String username, String password) {
        // 여기에서 실제로 데이터베이스 또는 다른 서비스와 통신하여 사용자를 인증합니다.
        // 임시로 true를 반환합니다.
        return true;
    }
}