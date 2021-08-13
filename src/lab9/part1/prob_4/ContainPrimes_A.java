package lab9.part1.prob_4;

import java.math.BigInteger;
import java.util.stream.Stream;

public class ContainPrimes_A {

	public static void main(String[] args) {
		final Stream<BigInteger> primes = Stream.iterate(BigInteger.TWO, BigInteger::nextProbablePrime).limit(100);
		primes.forEach(System.out::println);

	}

}
