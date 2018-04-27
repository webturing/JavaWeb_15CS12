package lec05JavaUtil;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;

public class P1221CountingWords {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		 String line=cin.nextLine();
		//String line = "to know everything is to know nothing.";
		String[] words = line.toLowerCase().trim().replaceAll("_","").split("\\W+");
		//System.out.println(Arrays.toString(words));
		System.out.println(words.length);// 7
		TreeMap<String, Integer> map = new TreeMap<String, Integer>();
		for (String word : words) {
			if (map.containsKey(word)) {
				int old = map.get(word);
				map.put(word, old + 1);
			} else {
				map.put(word, 1);
			}
		}
		// System.out.println(map);
		for (String word : map.keySet()) {
			System.out.println(word + ":" + map.get(word));
		}

		cin.close();

	}

}
