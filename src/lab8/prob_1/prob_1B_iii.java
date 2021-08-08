package lab8.prob_1;

import java.util.function.Supplier;

public class prob_1B_iii {
	class GenRandom implements Supplier<Double> {
		@Override
		public Double get() {
			return Math.random();
		}
	}

	static void main(String[] args) {
		prob_1B_iii randInn = new prob_1B_iii();
		GenRandom genRand = randInn.new GenRandom();
		System.out.println(genRand.get());
	}

}