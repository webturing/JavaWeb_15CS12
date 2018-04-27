package lec14SearchDfs;

public class Dfs1Demo3 {
	static int N = 9;
	static int[] a = new int[N];
	static boolean[] visited = new boolean[N];

	static void dfs(int k) {
		if (k == N) {
			int x = a[0] * 100 + a[1] * 10 + a[2];
			int y = a[3] * 100 + a[4] * 10 + a[5];
			int z = a[6] * 100 + a[7] * 10 + a[8];
			if (sq(x)&&sq(y)&&sq(z)) {
				System.out.println(String.format("%d %d %d", x, y, z));
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
	
	
	private static boolean sq(int x) {
		int y=(int) Math.sqrt(x);
		return y*y==x;
	}
}
