package best;

public class App {
	public static void main(String[] args) {
		Fruit apple =Factory.create("best.Apple");
		Fruit banana = Factory.create("best.Banana");
	}
}
