class A
{
	
}
public class ReflectionDemo {
public static void main(String[] args) {
	Object a=new A();
	A b=null;
//	try {
//		b=(A) Class.forName("A").newInstance();
//		
//	} catch (InstantiationException | IllegalAccessException
//			| ClassNotFoundException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
	System.out.println(b);
	System.out.println(b instanceof A);
	
}
}
