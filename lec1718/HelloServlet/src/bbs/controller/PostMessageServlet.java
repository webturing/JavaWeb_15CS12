package bbs.controller;

import java.io.IOException;
import java.util.Date;
import java.util.Vector;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bbs.model.Message;

public class PostMessageServlet extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	
		
		HttpSession session = req.getSession();
		String author=(String) session.getAttribute("user");
		String title=new String(req.getParameter("title").getBytes("ISO-8859-1"),"UTF-8");
		Date time=new Date();
		String content=new String(req.getParameter("content").getBytes("ISO-8859-1"),"UTF-8");
		
		Vector<Message> messages=(Vector<Message>) session.getAttribute("messages");
		messages.add(new Message(title,author,time,content));		
		resp.sendRedirect("index.jsp");

	}
}
