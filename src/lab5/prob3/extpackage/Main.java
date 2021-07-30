package lab5.prob3.extpackage;

import java.time.LocalDate;

import  lab5.prob3.CustOrderFactory;
import  lab5.prob3.CustomerAndOrder;

public class Main {
	public static void main(String[] args) {
		/*
		Customer cust = new Customer("Bob");
		Order order = Order.newOrder(cust, LocalDate.now());
		order.addItem("Shirt");
		order.addItem("Laptop");

		order = Order.newOrder(cust, LocalDate.now());
		order.addItem("Pants");
		order.addItem("Knife set");

		System.out.println(cust.getOrders());
		*/
		
		CustomerAndOrder a = CustOrderFactory.createCustomerAndOrderFactory("Russell");
		a.addOrder(LocalDate.now(), new String[]{"Jacket","Laptop"});
		a.addOrder(LocalDate.now(), new String[]{"DSLR","Knife set"});

		System.out.println(a.getCustomer().getOrders());
	}
}

		
