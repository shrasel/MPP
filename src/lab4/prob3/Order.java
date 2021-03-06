package lab4.prob3;

import java.time.LocalDate;

public class Order {
	private int orderNo;
	private LocalDate orderDate;
	private int orderAmount;

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public int getOrderAmount() {
		return orderAmount;
	}

	public int getOrderNo() {
		return orderNo;
	}

	public Order(int orderNo, LocalDate orderDate, int orderAmount) {
		this.orderNo = orderNo;
		this.orderDate = orderDate;
		this.orderAmount = orderAmount;
	}
}
