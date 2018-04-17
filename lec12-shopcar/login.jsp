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
		session.setAttribute("name",userName);
		TreeMap<String,Double> price=new TreeMap<String,Double>();

		TreeMap<String,Integer> shopcar=new TreeMap<String,Integer>();
		shopcar.put("IphoneX",3);price.put("IphoneX",8888.0);
		shopcar.put("MacbookPro",2);price.put("MacbookPro",28888.0);
		shopcar.put("IpadMin",2);price.put("IpadMin",3888.0);
		session.setAttribute("shopcar",shopcar);
		session.setAttribute("price",price);


		response.sendRedirect("index.jsp");
	
	}else{
		response.sendRedirect("login.html");
	}

%>