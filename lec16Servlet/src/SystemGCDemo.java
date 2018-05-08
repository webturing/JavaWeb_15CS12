public class SystemGCDemo {
	public static void main(String[] args) {
		Car car = new Car();
		Car car2=car;
		System.out.println(car);
		car=new Car();
		System.out.println(car);
		car2=null;
		System.gc();
	}
}
