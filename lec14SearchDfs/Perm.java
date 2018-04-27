package lec14SearchDfs;

public class Perm {
	public static void main(String[] args) {
		for (int a = 1; a <= 4; a++)
			for (int b = 1; b <= 4; b++)
				for (int c = 1; c <= 4; c++)
					for (int d = 1; d <= 4; d++) {
						if(a!=b&&a!=c&&a!=d
								&&b!=c&&b!=d
								&&c!=d
								
								)
							
							
						System.out.println(String.format("%d %d %d %d", a, b,
								c, d));
					}
	}
}
