import java.util.LinkedList;

public class Point24b {
    static Integer[] b = new Integer[]{1, 7, 8, 5};
    static boolean[] v = new boolean[b.length];
    static boolean find = false;

    static void dfs(int k, LinkedList<String> exp, double ans) {
        if (find)
            return;
        if (k == b.length && feqaul(ans, 24.0)) {
            exp.pollFirst();
            exp.pollLast();
            for (String e : exp)
                System.out.print(e);
            System.out.println();
            find = true;
            return;
        }
        for (int i = 0; i < 4; i++)
            if (!v[i]) {
                v[i] = true;
                if (exp.isEmpty()) {
                    exp.add(Integer.toString(b[i]));
                    dfs(k + 1, exp, b[i]);
                    exp.pollLast();
                } else for (char op : "+-*/".toCharArray()) {
                    int idx = "+-*/".indexOf(op);
                    if (idx == 0) {
                        exp.addFirst("(");
                        exp.addLast(op + "");
                        exp.addLast(b[i] + "");
                        exp.addLast(")");
                        dfs(k + 1, exp, ans + b[i]);
                        exp.pollFirst();
                        exp.pollLast();
                        exp.pollLast();
                        exp.pollLast();
                    } else if (idx == 1) {
                        exp.addFirst("(");
                        exp.add(op + "");
                        exp.add(b[i] + "");
                        exp.addLast(")");
                        dfs(k + 1, exp, ans - b[i]);
                        exp.pollFirst();
                        exp.pollLast();
                        exp.pollLast();
                        exp.pollLast();
                        exp.addFirst("(");
                        exp.addFirst(op + "");
                        exp.addFirst(b[i] + "");
                        exp.addLast(")");
                        dfs(k + 1, exp, b[i] - ans);
                        exp.pollFirst();
                        exp.pollFirst();
                        exp.pollFirst();
                        exp.pollLast();
                    } else if (idx == 2) {
                        exp.addFirst("(");
                        exp.add(op + "");
                        exp.add(b[i] + "");
                        exp.addLast(")");
                        dfs(k + 1, exp, ans * b[i]);
                        exp.pollFirst();
                        exp.pollLast();
                        exp.pollLast();
                        exp.pollLast();
                    } else if (idx == 3 ) {
                        if (b[i] != 0) {
                            exp.addFirst("(");
                            exp.add(op + "");
                            exp.add(b[i] + "");
                            exp.addLast(")");
                            dfs(k + 1, exp, ans / b[i]);
                            exp.pollFirst();
                            exp.pollLast();
                            exp.pollLast();
                            exp.pollLast();
                        }
                        if (ans != 0) {
                            exp.addFirst("(");
                            exp.addFirst(op + "");
                            exp.addFirst(b[i] + "");
                            exp.addLast(")");
                            dfs(k + 1, exp, b[i] / ans);
                            exp.pollFirst();
                            exp.pollFirst();
                            exp.pollFirst();
                            exp.pollLast();
                        }
                    }
                }
                v[i] = false;
            }
    }

    public static void main(String[] args) {
        dfs(0, new LinkedList<>(), 0);
    }

    public static boolean feqaul(double a, double b) {
        return Math.abs(a - b) < 1e-6;
    }
}
