<%@ page contentType="text/html;charset=gb2312"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.yxq.valuebean.GoodsSingle" %>
<%!
	static ArrayList goodslist=new ArrayList();			//�����洢��Ʒ
	static{												//��̬�����
		String[] names={"ƻ��","�㽶","��","����"};		//��Ʒ����
		float[] prices={2.8f,3.1f,2.5f,2.3f};			//��Ʒ�۸�
		for(int i=0;i<4;i++){							//��ʼ����Ʒ��Ϣ�б�
			//����һ��GoodsSingle���������װ��Ʒ��Ϣ			
			GoodsSingle single=new GoodsSingle();
			single.setName(names[i]); 					//��װ��Ʒ������Ϣ
			single.setPrice(prices[i]); 				//��װ��Ʒ�۸���Ϣ
			single.setNum(1); 							//��װ����������Ϣ
			goodslist.add(i,single); 					//������Ʒ��goodslist���϶�����
		}	
	}
%>
<%
	session.setAttribute("goodslist",goodslist); 		//������Ʒ�б�session��
	response.sendRedirect("show.jsp");					//��ת��show.jspҳ����ʾ��Ʒ
%>
