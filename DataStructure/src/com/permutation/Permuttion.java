package com.permutation;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Permuttion extends Object{
	public static HashSet<String> getAllPermutations(String str) {
		// Create a hash set to prevent any duplicate entries
		HashSet<String> permutations = new HashSet<String>();

		if (str == null || str.length() == 0) {
			permutations.add("");
			return permutations;
		}

		char first = str.charAt(0);
		String remainingString = str.substring(1);
		HashSet<String> words = getAllPermutations(remainingString);
		for (String word : words) {
			for (int i = 0; i <= word.length(); i++) {
				String prefix = word.substring(0, i);
				String suffix = word.substring(i);
				permutations.add(prefix + first + suffix);
			}
		}
		return permutations;
	}

	public static void main(String[] args) {
		String str = "abc";
		HashSet<String> permutations = getAllPermutations(str);
		System.out.println(permutations.toString());
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(1, 2);
		if (map.containsValue(2)) {
			System.out.println("ttttttttttttttttt");
		}
		Set<Integer> s = new TreeSet<>();
		s.add(2);
		s.add(3);
		s.add(4);
		s.add(1);
		System.out.println("ttttttttttttttttt"+s.toString());
		
	
	}
}
