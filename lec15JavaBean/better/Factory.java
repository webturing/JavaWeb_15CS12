package better;

public class Factory {

	public static Fruit create(String fruitName) {
		if (fruitName.equalsIgnoreCase("apple"))
			return new Apple();
		if (fruitName.equalsIgnoreCase("banana"))
			return new Banana();
		return null;
	}

}
