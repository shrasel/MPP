package lab3.prob4;

import lab3.prob4.properties.Property;

public class Admin {
	public static double computeTotalRent(Property[] properties) {
		double totalRent = 0;
		for (Property o : properties) {
			totalRent += o.computeRent();
//			System.out.println(o);
		}
		/*
		for (Object o : properties) {
			if (o instanceof House) {
				House h = (House) o;
				totalRent += h.computeRent();
			}
			else if (o instanceof Condo) {
				Condo h = (Condo) o;
				totalRent += h.computeRent();
			}
			else if (o instanceof Trailer) {
				Trailer h = (Trailer) o;
				totalRent += h.computeRent();
			}	
		}
		*/
		return totalRent;
	}
	
	public static void listAllProperties(Property[] properties) {
		for (Property o : properties) {
			System.out.println(o);
		}
	}
}
