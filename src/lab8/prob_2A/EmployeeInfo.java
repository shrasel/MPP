package lab8.prob_2A;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeInfo {
	static enum SortMethod {
		BYNAME, BYSALARY
	};

	SortMethod method;

	public EmployeeInfo(SortMethod method) {
		this.method = method;
	}

	public void sort(List<Employee> emps) {
		if (method == SortMethod.BYNAME) {
			Collections.sort(emps, new EmployeeNameComparator());
		} else if (method == SortMethod.BYSALARY) {
			Collections.sort(emps, new EmployeeSalaryComparator());
		}
	}

	public static void main(String[] args) {
		List<Employee> emps = new ArrayList<>();
		emps.add(new Employee("Joe", 10000));
		emps.add(new Employee("Joe", 10000));
		emps.add(new Employee("Andy", 60000));

		Employee joe1 = new Employee("Joe", 100000);
		Employee joe2 = new Employee("Joe", 100000);

		System.out.println("Joe1 equals joe2? " + joe1.equals(joe2));

		EmployeeNameComparator ec = new EmployeeNameComparator();
		System.out.println("Joe2 equals joe1? " + (ec.compare(joe2, joe1) == 0));

		EmployeeInfo ei = new EmployeeInfo(EmployeeInfo.SortMethod.BYNAME);
		ei.sort(emps);
		System.out.println(emps);
		ei = new EmployeeInfo(EmployeeInfo.SortMethod.BYSALARY);
		ei.sort(emps);
		System.out.println(emps);

	}
}
