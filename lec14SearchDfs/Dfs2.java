package lec14SearchDfs;

public class Dfs2 {
	static int N = 4;
	static int[] a = new int[N];
	static boolean[] visited = new boolean[N];

	static void dfs(int k) {
		if (k == N) {
			for (int i = 0; i < N; i++)
				System.out.print(a[i]);
			System.out.println();
			return;
		}
		for (int i = 0; i < N; i++) {
			if (visited[i] == false) {
				visited[i] = true;
				a[k] = i+1;
				dfs(k + 1);
				visited[i] = false;
			}
		}

	}

	public static void main(String[] args) {
		dfs(0);
	}
}
