package lab9.part2.prob_7;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(4, 5, -2, 0, -3, -1, -5, -4);
		// expected output: [0, -1, -2, -3, -4, 4, -5, 5]
		ordering1(intList);
		List<String> stringList = Arrays.asList("cba", "efg", "doe", "fie", "set");
		// expected output: [cba, fie, doe, efg, set]
		ordering2(stringList);

	}

	// Orders the integers according to this pattern:
	// 0, -1, 1, -2, 2, -3, 3, . . .
	// Using this ordering, this method sorts the list as part of
	// a stream pipeline, and prints to the console
	public static void ordering1(List<Integer> list) {
		List<Integer> sortedInt = list.stream()
				.sorted(Comparator.comparing((Integer a) -> Math.abs(a)).thenComparing((a, b) -> a - b))
				.collect(Collectors.toList());
		System.out.println(sortedInt);

	}

	// Orders words by first reversing each and comparing
	// in the usual way. So
	// cba precedes bed
	// since
	// cba.reverse() precedes bed.reverse()
	// in the usual ordering
	// Using this ordering, this method sorts the list as part of
	// a stream pipeline, and prints to the console
	public static void ordering2(List<String> words) {
		List<String> sorted = words.stream().sorted((a, b) -> reverse(a).compareTo(reverse(reverse(b))))
				.collect(Collectors.toList());
		System.out.println(sorted);

	}

	public static String reverse(String str) {
		StringBuffer st = new StringBuffer();
		for (int i = str.length() / 2; i >= 0; i--)
			st.append(str.charAt(i));
		return st.toString();
	}

}
