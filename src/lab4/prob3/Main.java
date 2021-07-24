package lab4.prob3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Order> list = new ArrayList<>();
		list.add(new Order(100, LocalDate.of(2021, 01, 05), 200));
		list.add(new Order(101, LocalDate.of(2020, 6, 9), 201));
		Commissioned comisson = new Commissioned("123", 500, 0.8, list);
		
		Employee[] emp = { 
				new Salaried("124", 1000), 
				new Hourly("125", 120, 40), 
				comisson 
				};
		
		for (Employee e : emp) {
			e.print(1, 2021);

		}
	}
}
