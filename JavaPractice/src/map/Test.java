package map;

import java.util.*;

public class Test {
	public static void main(String[] args) {
		String s = "44qwerty134qw5erty2";
		List<Integer> list = new ArrayList<>();
		int len = s.length();
		for (int i = 0; i < len; i++) {
			if (Character.isDigit(s.charAt(i))) {
				// System.out.print(s.charAt(i));
				// i++;

				String temp = "";
				;
				while (i < len && Character.isDigit(s.charAt(i))) {
					System.out.print(s.charAt(i));
					temp = temp + s.charAt(i);

					i++;
				}

				list.add(Integer.parseInt(temp));//Character.isDigit(

			}
		}
		System.out.print(list.toString());
	}

	private static void revInt(int temp) {

	}
}
