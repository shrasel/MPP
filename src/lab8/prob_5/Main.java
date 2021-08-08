package lab8.prob_5;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon", "Away", "On Vacation",
				"Everywhere you want to be");

		Consumer<String> cons = new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.print(t.toUpperCase() + ", ");
			}
		};

		// 5.a implement a Consumer
		System.out.println("Using Consumer Interface");
		list.forEach(str -> cons.accept(str));

		System.out.println("\n \nUsing lambda expression");
		list.forEach(str -> System.out.print(str.toUpperCase() + ", "));

		// 5.b
		System.out.println("\n\nUsing method reference");
		list.forEach(Main::printUpper);
	}

	static void printUpper(String s) {
		System.out.print(s.toUpperCase() + ",");
	}

}
