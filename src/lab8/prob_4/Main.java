package lab8.prob_4;

import java.util.Arrays;
import java.util.List;

public class Main implements FilterInterface {
	// imperative solution
	@Override
	public int countWords(List<String> words, char c, char d, int len) {
		int count = 0;
		// count no of words which have length equal to len
		for (String word : words) {
			if (word.length() == len) {
				if (word.contains("" + c) && !word.contains("" + d))
					count++;
			}
		}
		return count;
	}

	// Good
	static FilterInterface f1 = new FilterInterface() {
		@Override
		public int countWords(List<String> words, char c, char d, int len) {
			return (int) words.stream()
					.filter(word -> word.length() == len && word.contains("" + c) && !word.contains("" + d)).count();
		}
	};

	// Better
	static FilterInterface f2 = (words, c, d, len) -> (int) words.stream()
			.filter(word -> word.length() == len && word.contains("" + c) && !word.contains("" + d)).count();

	public static void main(String[] args) {
		Main m = new Main();
		// Imperative
		int a = m.countWords(Arrays.asList("apple", "ant", "lal", "ice", "cab"), 'a', 'b', 2);
		System.out.println(a);

		// Good
		int as = f1.countWords(Arrays.asList("apple", "ant", "lal", "ice", "cab"), 'a', 'b', 3);
		System.out.println(as);
		// Better
		int asd = f2.countWords(Arrays.asList("apple", "ant", "lal", "ice", "cab"), 'a', 'b', 3);
		System.out.println(asd);

	}

}
