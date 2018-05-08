/**
 * 
 */
package zj;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Administrator
 *w
 */

public class HelloServlet extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse respsone)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=respsone.getWriter();
		String user=request.getParameter("user");
		if(user==null)
			out.println("<h1>Hello Stranger~</h1>");
		else		
			out.println(String.format("<h1>Hello %s</h1>",user));
		
	}
}
