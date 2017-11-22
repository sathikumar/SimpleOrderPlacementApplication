package com.java.order.app.controller;

import com.java.order.app.facade.OrderServiceFacade;
import com.java.order.app.product.Product;
import com.java.order.app.user.User;

/**
 * @author sathishkumar
 *
 */
public class OrderPlacementController {

	OrderServiceFacade orderService;
	
	public OrderServiceFacade getOrderService() {
		return orderService;
	}

	public void setOrderService(OrderServiceFacade orderService) {
		this.orderService = orderService;
	}

	public boolean placeOrder(User user, Product product) {
		boolean isOrderplaced = orderService.placeOrder(user, product);
		if(isOrderplaced) {
			System.out.println("Successfully placed your order");
		} else {
			System.out.println("Sorry we are unable to place your order");
		}
		return isOrderplaced;
	}
}
