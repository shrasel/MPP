package lab2.prob2b;

class OrderLine {
	private String orderItem;
	private Order order;

	public OrderLine(String orderItem, Order order) {
		this.orderItem = orderItem;
		this.order = order;
	}
	
	public Order getOrder() {
		return order;
	}

	public String getOrderItem() {
		return orderItem;
	}
}