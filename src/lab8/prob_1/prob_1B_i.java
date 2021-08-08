package lab8.prob_1;

import java.util.function.Supplier;

public class prob_1B_i {
	public static void main(String[] args) {

		new Supplier<Double>() {
			@Override
			public Double get() {
				// TODO Auto-generated method stub
				return Math.random();
			}
			
		};
		
	}
}