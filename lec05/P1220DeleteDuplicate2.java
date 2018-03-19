import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class P1220DeleteDuplicate2 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			int cur = cin.nextInt();
			if (!list.contains(cur))
				list.add(cur);
		}
		Collections.sort(list);
		for (Integer i : list)
			System.out.println(i);
		cin.close();
	}
}
