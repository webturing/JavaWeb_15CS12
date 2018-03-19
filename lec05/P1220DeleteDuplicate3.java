import java.util.Scanner;
import java.util.TreeSet;

public class P1220DeleteDuplicate3 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		TreeSet<Integer> set=new TreeSet<Integer>();
		for(int i=0;i<n;i++)
			set.add(cin.nextInt());
		System.out.println(set);
		cin.close();
	}
}
