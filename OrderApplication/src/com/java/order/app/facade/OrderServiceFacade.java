package com.java.order.app.facade;

import com.java.order.app.product.Product;
import com.java.order.app.user.User;

/**
 * @author sathishkumar
 *
 */
public interface OrderServiceFacade {

	public boolean placeOrder(User user, Product product);
}
