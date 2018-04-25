import java.util.Arrays;

public class Dfs1Demo4 {
	static int N = 9;
	static int[] a = new int[N];
	static boolean[] visited = new boolean[N];

	static void dfs(int k) {
		if (k == N) {

			if (ok()) {
				System.out.println(Arrays.toString(a));
			}
			return;
		}
		for (int i = 0; i < N; i++) {
			if (visited[i] == false) {
				visited[i] = true;
				a[k] = i + 1;
				dfs(k + 1);
				visited[i] = false;
			}
		}

	}

	public static void main(String[] args) {
		dfs(0);
	}

	private static boolean ok() {
		int t = a[0];
		for (int i = 1; i < N; i++) {
			t = t * 10 + a[i];
			if (t % (i + 1) != 0)
				return false;
		}
		return true;
	}

}
