package zj;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req, resp);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		if (userName == null || password == null) {
			response.sendRedirect("index.jsp");
		} else if (userName.equals("tom") && password.equals("cat")) {
			response.sendRedirect("ok.jsp");
		}else{
			response.sendRedirect("index.jsp");
		}

	}

}
