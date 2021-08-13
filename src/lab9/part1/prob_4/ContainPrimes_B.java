package lab9.part1.prob_4;

import java.math.BigInteger;
import java.util.stream.Stream;

public class ContainPrimes_B {

	public static void main(String[] args) {
		ContainPrimes_B ps = new ContainPrimes_B();
		ps.printFirstNPrimes(100);
		System.out.println("====");
		ps.printFirstNPrimes(5);
	}

	public void printFirstNPrimes(long n) {
		final Stream<BigInteger> primes = Stream.iterate(BigInteger.TWO, BigInteger::nextProbablePrime);
		primes.limit(n).forEach(System.out::println);
	}

}
