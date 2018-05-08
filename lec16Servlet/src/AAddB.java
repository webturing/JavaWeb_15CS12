import java.io.PrintWriter;
import java.util.Scanner;

public class AAddB {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		PrintWriter cout = new PrintWriter(System.out);
		foo(cin,cout);
		cout.close();
	}

	private static void foo(Scanner cin,PrintWriter cout) {
		int a=cin.nextInt();
		int b=cin.nextInt();
		cout.println(a+b);
		
	}
}
