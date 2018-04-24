package point24;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class RPorlandExpression {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] exp = "3 4 + 5 6 + *".split(" ");
		System.out.println(Arrays.toString(exp));
		System.out.println(evalue(exp));

	}

	public static double evalue(String[] exp) {
		Stack<Double> st = new Stack<Double>();
		for (String e : exp) {
			if ("+-*/".contains(e)) {
				if(st.size()<2)
					return -1;
				double b = st.pop();
				double a = st.pop();
				int idx = "+-*/".indexOf(e);
				if (idx == 0)
					st.push(a + b);
				else if (idx == 1)
					st.push(a - b);
				else if (idx == 2)
					st.push(a * b);
				else
					st.push(a / b);
			} else {
				st.push(Double.parseDouble(e));
			}
		}
			if(st.size()!=1)
				return -1;
			return st.peek();
		
	}

	public static double evalue(List<String> v) {
		String [] exp=new String[v.size()];
		for(int i=0;i<v.size();i++)
			exp[i]=v.get(i);
		return evalue(exp);
	}

}
