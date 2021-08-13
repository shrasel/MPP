package lab11s.prob2;

import java.time.*;
import java.util.*;

public class SecondSmallest {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(4, 2, 3, 6);
		System.out.println(secondSmallest2(list));
		
		List<Employee> list2 
		  = Arrays.asList(new Employee("joe", 10000), new Employee("tom", 200000));
		
		System.out.println(secondSmallest2(list2));
		
		List<LocalDate> dates = Arrays.asList(LocalDate.of(1900, 1, 1), LocalDate.of(1950,1,1),
				LocalDate.of(1975, 1, 1), LocalDate.of(2000, 1, 1));
		System.out.println(secondSmallest3(dates));
	
	}

	public static Integer secondSmallest(List<Integer> list) {
		int smallest = list.get(0);
		int secondSmallest = list.get(1);
		if (smallest > secondSmallest) {
			int temp = smallest;
			smallest = secondSmallest;
			secondSmallest = temp;
		}
		for (int i = 2; i < list.size(); ++i) {
			int next = list.get(i);
			if (next < smallest) {
				secondSmallest = smallest;
				smallest = next;
			} else if (next < secondSmallest) {
				secondSmallest = next;
			}

		}
		return secondSmallest;
	}


	public static <T extends Comparable<T>> T secondSmallest2(List<T> list) {
		T smallest = list.get(0);
		T secondSmallest = list.get(1);
		if(smallest.compareTo(secondSmallest)>0) {
			T temp = smallest;
			smallest = secondSmallest;
			secondSmallest = temp;
		}
		for(int i = 2; i < list.size(); ++i) {
			T next = list.get(i);
			if(next.compareTo(smallest)<0) {
				secondSmallest = smallest;
				smallest = next;
			}
			else if(next.compareTo(secondSmallest)<0) {
				secondSmallest = next;
			}
			
		}
		return secondSmallest;
	}
	
	public static <T extends Comparable<? super T>> T secondSmallest3(List<T> list) {
		T smallest = list.get(0);
		T secondSmallest = list.get(1);
		if(smallest.compareTo(secondSmallest)>0) {
			T temp = smallest;
			smallest = secondSmallest;
			secondSmallest = temp;
		}
		for(int i = 2; i < list.size(); ++i) {
			T next = list.get(i);
			if(next.compareTo(smallest)<0) {
				secondSmallest = smallest;
				smallest = next;
			}
			else if(next.compareTo(secondSmallest)<0) {
				secondSmallest = next;
			}
			
		}
		return secondSmallest;
	}

}
