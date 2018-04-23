import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;

public class CollectionShuffle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] exp = "1 5 + 7 8 - *".split(" ");
		// System.out.println(Arrays.toString(exp));
		Vector<String> v = new Vector<String>();
		for (String e : exp)
			v.add(e);
		// System.out.println(v);
		for (int i = 0; i < 10000; i++) {
			Collections.shuffle(v);
			double ans = RPorlandExpression.evalue(v);
			if (ans == 24.0) {
				System.out.println(v);
				return;
			}

		}

	}

}
