package lab8.prob_2C;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeInfo {
	static enum SortMethod {
		BYNAME, BYSALARY
	};

	public void sort(List<Employee> emps, SortMethod method) {

		Collections.sort(emps, (e1, e2) -> {
			if (method == SortMethod.BYNAME) {
				int compareValue = e1.name.compareTo(e2.name);
				if (compareValue == 0) {
					if (e1.salary == e2.salary)
						compareValue = 0;
					else if (e1.salary < e2.salary)
						compareValue = -1;
					else
						compareValue = 1;
				}
				return compareValue;
			} else {
				if (e1.salary == e2.salary)
					return 0;
				else if (e1.salary < e2.salary)
					return -1;
				else
					return 1;
			}
		});
	}

	public static void main(String[] args) {
		List<Employee> emps = new ArrayList<>();
		emps.add(new Employee("Joe", 100000));
		emps.add(new Employee("Tim", 50000));
		emps.add(new Employee("Andy", 60000));
		EmployeeInfo ei = new EmployeeInfo();
		ei.sort(emps, EmployeeInfo.SortMethod.BYNAME);
		System.out.println(emps);
		// same instance
		ei.sort(emps, EmployeeInfo.SortMethod.BYSALARY);
		System.out.println(emps);
	}
}
