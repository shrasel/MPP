package lab9.part2.prob_8;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
	static List<OrderItem> orderItems = new ArrayList<>();
	public static void main(String[] args) {
		Main m = new Main();
		m.loadOrderItemData();
		System.out.println("Do any of these Order Items have an order of flowers? " + 
		   m.findProduct("Flowers"));
		newLst();
	}
	
	private static void newLst(){
		 orderItems.stream()
		.map(ot->ot.getProduct().getProductName()+":"+ot.getProduct().getUnitPrice())
		.forEach(System.out::println);
		
	}
	
	private boolean findProduct(String prodName) {		
		long productNumber = orderItems.stream()
				.map(x->x.getProduct().getProductName())
				.filter(name->name.equalsIgnoreCase(prodName))
				.count();
				
		/*for(OrderItem item : orderItems) {
			if(item != null) {
				Product p=item.getProduct();
				if(p != null) {
					String name = p.getProductName();
					if(name != null) {
						if(name.equals(prodName)) return true;
					}
				}
			}
		}*/
		return productNumber>0;
	}
	
	private void loadOrderItemData() {
		orderItems.add(new OrderItem(new Product("1016", "Tools", 131.00), 3));
		orderItems.add(new OrderItem(new Product("1017", "Fishing Rod", 111.00), 1));
		orderItems.add(new OrderItem(new Product("1018", "Game of Go",66.00), 2));
		orderItems.add(new OrderItem(new Product("1019", "Flowers", 221.00), 5));
	}
}
