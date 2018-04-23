import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class Game {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner cin = new Scanner(System.in);
		int a[] = { cin.nextInt(), cin.nextInt(), cin.nextInt(), cin.nextInt() };
		cin.close();
		String[] ops = "+ - * /".split(" ");
		while (true) {
			List<String> exp = new Vector<String>();
			for (int i : a)
				exp.add(Double.toString(i * 1.0));
			for (int i = 0; i < 3; i++) {
				exp.add(ops[rand.nextInt(4)]);
			}
			Collections.shuffle(exp);
			if (RPorlandExpression.evalue(exp) == 24.0) {
				BinaryTree.buildBTree(exp).midVisit();
				break;
			}

		}

	}

}
