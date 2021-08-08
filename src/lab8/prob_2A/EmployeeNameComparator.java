package lab8.prob_2A;

import java.util.Comparator;

/* A functor, but not a closure */
public class EmployeeNameComparator implements Comparator<Employee> {
	@Override
	public int compare(Employee e1, Employee e2) {

		int compareValue = e1.name.compareTo(e2.name);

		if (compareValue == 0) {
			if (e1.salary == e2.salary)
				compareValue = 0;
			else
				compareValue = 1;
		}

		return compareValue;
	}
}