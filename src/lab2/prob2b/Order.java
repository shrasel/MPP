package lab2.prob2b;

import java.util.ArrayList;
import java.util.List;

class Order {
	private int orderNum;
	List<OrderLine> oLine = new ArrayList<>();

	public Order(int orderNum, String orderItem) {
		this.orderNum = orderNum;
		oLine.add(new OrderLine(orderItem, this));
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order Details : \n");
		for (OrderLine o : this.oLine) {
			sb.append("Item : " + o.getOrderItem() + "\n");
		}
		return sb.toString();
	}
}
