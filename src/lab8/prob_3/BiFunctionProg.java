package lab8.prob_3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class BiFunctionProg {
	/*
	 * As a lambda: public static void main(String[] args) { BiFunction<Integer,
	 * Integer, Integer> f = (x,y) -> 2*x - y; System.out.println(f.apply(2, 3)); }
	 */
	public static void main(String[] args) {

		BiFunction<Double, Double, List<Double>> bif = (x, y) -> {
			List<Double> list = new ArrayList<>();
			list.add(Math.pow(x, y));
			list.add(x * y);
			return list;

		};

		List<Double> result = bif.apply(2.0, 3.0);
		System.out.println(result);

	}

}
