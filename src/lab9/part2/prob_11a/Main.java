package lab9.part2.prob_11a;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//import old.lesson9.labsolns.prob7b.Employee;
//import old.lesson9.labsolns.prob7b.TriFunction;

public class Main {

	public static void main(String[] args) {
		List<Employee> emps = Arrays.asList(new Employee("Joe", "Davis", 120000), new Employee("John", "Sims", 110000),
				new Employee("Joe", "Stevens", 200000), new Employee("Andrew", "Reardon", 80000),
				new Employee("Joe", "Cummings", 760000), new Employee("Steven", "Walters", 135000),
				new Employee("Thomas", "Blake", 111000), new Employee("Alice", "Richards", 101000),
				new Employee("Donald", "Trump", 100000));

		// ============ Answer for A ============

		String specialEmployee = emps.stream().filter(e -> e.getSalary() > 100000)
				.filter(e -> e.getLastName().charAt(0) > 'M').sorted(Comparator.comparing(Employee::getFirstName))
				.map(e -> e.getFirstName().concat(" " + e.getLastName())).collect(Collectors.joining(", "));

		System.out.println("========== Stream Pipeline from Main ");
		System.out.println(specialEmployee);

		// ============ Answer for B ============
		String lettersRange = "N-Z";
		Integer salary = 100000;

		System.out.println("\n  ");
		String specialEmployee2 = LambdaLibrary.SELECTED_EMPLOYEES.apply(emps, lettersRange, salary);
		System.out.println(specialEmployee2);

	}

}
