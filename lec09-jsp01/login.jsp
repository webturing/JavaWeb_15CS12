<%@page import="java.util.*,java.io.*"%>
<%
	String userName=request.getParameter("userName").trim();
	String password=request.getParameter("password");

	boolean find=false;
	try{
		Scanner cin=new Scanner(new File("userlist.txt"));
		while(cin.hasNextLine()){
			String line=cin.nextLine();
			String ss[]=line.split("\\s+");
			if(ss[0].equals(userName)&&ss[1].equals(password)){
				find=true;
				break;
			}
		}
		cin.close();		

	}catch(Exception e){}



	if(find){
		response.sendRedirect("index.jsp?username="+userName);
	
	}else{
		response.sendRedirect("login.html");
	}

%>