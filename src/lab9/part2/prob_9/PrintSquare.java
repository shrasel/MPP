package lab9.part2.prob_9;

import java.util.stream.IntStream;


public class PrintSquare {
	
	public static void main(String[] args) {
		printSquares(5);
	}
	
	public static void printSquares(int num) {
		IntStream.iterate(1, n -> n + 1).limit(num).forEach(n->System.out.println(n*n));
	
	}

}
