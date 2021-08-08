package lab8.prob_1;

import java.util.function.Supplier;

public class prob_1B_ii {
	public static void main(String[] args) {

		Supplier<Double> s = Math::random;
		System.out.println(s.get());
	}
}