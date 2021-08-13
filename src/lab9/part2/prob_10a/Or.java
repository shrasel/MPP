package lab9.part2.prob_10a;

import java.util.*;

public class Or {

	public static void main(String[] args) {
		List<Simple> list = Arrays.asList(new Simple(false), new Simple(false), new Simple(true));
		System.out.println("At least one of the Classes contains true flag:(true/false) "+someSimpleIsTrue(list));

	}
	
	public static boolean someSimpleIsTrue(List<Simple> list) {
		boolean accum = list.stream()
				.map( x->x.flag)
				.reduce(false,(s1,s2)->s1||s2);
		return accum;
	}
	
	
	
	/*public boolean someSimpleIsTrue(List<Simple> list) {
		boolean accum = false;
		for(Simple s: list) {
			accum = accum || s.flag;
		}
		return accum;
	} */

}
