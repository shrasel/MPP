package lab5.prob2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	private static double sum = 0;

	public static void main(String[] args) {

		List<Figure> list = new ArrayList<Figure>();

		list.add(new Circle(18.5));
		list.add(new Triangle(9.5, 5));
		list.add(new Rectangle(9, 5));

		for (Figure shape : list) {
			sum += shape.computeArea();
		}

		System.out.println("Sum = " + sum);
	}

}
