import java.util.Arrays;
import java.util.Scanner;

public class P1220DeleteDuplicate {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++)
			arr[i] = cin.nextInt();
		Arrays.sort(arr);
		System.out.println(arr[0]);
		int recent = arr[0];//
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != recent){
				System.out.println(arr[i]);
				recent = arr[i];
			}
		}
		cin.close();
	}
}
