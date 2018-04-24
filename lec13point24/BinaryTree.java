package point24;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class BinaryTree {
	String root;
	BinaryTree left;
	BinaryTree right;

	public BinaryTree() {
		root = "";
		left = right = null;
	}

	public BinaryTree(String root, BinaryTree left, BinaryTree right) {
		super();
		this.root = root;
		this.left = left;
		this.right = right;
	}

	static BinaryTree buildBTree(List<String> exp) {
		Stack<BinaryTree> st = new Stack<BinaryTree>();
		for (String e : exp) {
			if ("+-*/".contains(e)) {
				BinaryTree op = new BinaryTree(e, null, null);
				BinaryTree b = st.pop();
				BinaryTree a = st.pop();
				op.right = b;
				op.left = a;
				st.push(op);
			} else {
				st.push(new BinaryTree(e, null, null));
			}
		}

		return st.pop();

	}

	public void midVisit() {
		if (left != null) {
			System.out.print("(");
			left.midVisit();
		}
		System.out.print(root);
		if (right != null) {
			right.midVisit();
			System.out.print(")");
		}
	}
	public void midVisit(StringBuffer buffer) {
		if (left != null) {
			buffer.append("(");
			left.midVisit(buffer);
		}
		buffer.append(root);
		if (right != null) {		
			right.midVisit(buffer);
			buffer.append(")");
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BinaryTree bt = BinaryTree.buildBTree(Arrays.asList("8 7 1 + 5 - *"
				.split("\\s+")));
		//bt.midVisit();
		StringBuffer buffer=new StringBuffer("");
		bt.midVisit(buffer);
		System.out.println(buffer);
	}

}
