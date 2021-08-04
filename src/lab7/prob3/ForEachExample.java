package lab7.prob3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachExample {

	static Consumer<String> myConsumer = new Consumer<String>() {
		@Override
		public void accept(String t) {
			System.out.println(t.toUpperCase());
		}
	};

	// second implementation of consumer - lambda version
	// static Consumer<String> myConsumer = string ->
	// System.out.println(string.toUpperCase());

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello there", "Great place", "come back soon", "Go Away, its raining",
				"On Vacation", "Maharishi University");

		// print each element of the list in upper case format
		list.forEach(myConsumer);
		// for (String s : list){
		// myConsumer.accept(s);
		// }

	}

}