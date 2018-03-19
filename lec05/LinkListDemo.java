import java.util.LinkedList;


public class LinkListDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<Integer>();
		for(int i=0;i<10;i++)
			list.add(i);
		System.out.println(list);
		System.out.println(list.removeFirst());
		System.out.println(list);
		list.addLast(list.removeFirst());
		System.out.println(list);
		

	}

}
