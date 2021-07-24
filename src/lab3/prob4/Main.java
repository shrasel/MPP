package lab3.prob4;

import lab3.prob4.properties.*;

public class Main {

	public static void main(String[] args) {
		Address houseAddr = new Address("FareFeild","North 4th Street 1000","IOWA","52557");
		Address connAddr = new Address("FareFeild","North 2th Street 2000","IOWA","52556");
		Address trailerAddr = new Address("FareFeild","North 1th Street 3000","IOWA","52556");
		Property[] properties = { new House(9000,houseAddr), new Condo(2,connAddr), new Trailer(trailerAddr) };
		
		Admin.listAllProperties(properties);
		double totalRent = Admin.computeTotalRent(properties);
		
		System.out.println(totalRent);
	}
}
