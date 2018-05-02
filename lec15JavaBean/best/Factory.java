package best;

public class Factory {

	public static Fruit create(String className) {//RunTime Type Identification
		try {
			Object o=Class.forName(className).newInstance();
			return (Fruit)o;
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

}
