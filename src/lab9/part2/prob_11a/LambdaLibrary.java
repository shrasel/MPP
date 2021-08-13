package lab9.part2.prob_11a;

import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class LambdaLibrary {

	public static final TriFunction<List<Employee>, String, Integer, String> SELECTED_EMPLOYEES = (emps, lettersRange,
			salary) -> emps.stream()

					.filter(e -> e.getSalary() > salary)
					.filter(e -> Pattern.compile("\\A[" + lettersRange + "]").matcher(e.getLastName()).find())
					.sorted(Comparator.comparing(Employee::getFirstName))
					.map(e -> e.getFirstName().concat(" " + e.getLastName())).collect(Collectors.joining(", "));

}
