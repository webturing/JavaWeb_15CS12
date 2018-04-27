package lec13point24Game;
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
		Scanner cin = new Scanner(System.in);
		int a[] = { cin.nextInt(), cin.nextInt(), cin.nextInt(), cin.nextInt() };
		cin.close();
		String ans=solve24(a);
		System.out.println(ans);

	}

	public static String solve24(int[] a) {
		Random rand = new Random();
		String[] ops = "+ - * /".split(" ");
		for(int t=0;t<10000;t++){
			List<String> exp = new Vector<String>();
			for (int i : a)
				exp.add(Double.toString(i * 1.0));
			for (int i = 0; i < 3; i++) {
				exp.add(ops[rand.nextInt(4)]);
			}
			Collections.shuffle(exp);
			if (Math.abs(RPorlandExpression.evalue(exp)- 24.0)<1e-6) {
				StringBuffer buffer=new StringBuffer();
				BinaryTree.buildBTree(exp).midVisit(buffer);
				return buffer.toString();
			}

		}
		return "NO solution?";
	}

}
