package com.sms.rahul;

class ShoppingCartEntry1 {
	float pricedummy;
	int quantity;

	public float getTotalPrice() {
		return pricedummy * quantity;
	}
}

class CartContents {
	ShoppingCartEntry1[] items;

	public float getTotalPrice() {
		float totalPrice = 0;
		for (ShoppingCartEntry1 item : items) {
			totalPrice += item.getTotalPrice();
		}
		return totalPrice;
	}
}

class Order1 {
	private CartContents cart;
	private float salesTax;

	public Order1(CartContents cart, float salesTax) {
		this.cart = cart;
		this.salesTax = salesTax;
	}

	public float totalPrice() {
		return cart.getTotalPrice() * (1.0f + salesTax);
	}
}

public class CouplingExampleSolution {
}