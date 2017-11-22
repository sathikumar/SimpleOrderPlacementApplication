package com.java.order.app.test;

import org.junit.Before;
import org.junit.Test;

import com.java.order.app.controller.OrderPlacementController;
import com.java.order.app.facade.OrderServiceFacadeImpl;
import com.java.order.app.product.Product;
import com.java.order.app.user.User;

import junit.framework.Assert;

/**
 * @author sathishkumar
 *
 */
public class OrderPlacementControllerTest {
	
	public User user;
	public Product product;
	public Product invalidProduct;
	public Product invalidQuantity;
	public OrderPlacementController controller;
	
	@Before
	public void setUp() {
		user = new User("sathish", "abc@gmail.com", "123 address", "12345");
		product = new Product("iphone8", "iphone", 2, 800.0);
		//Not in inventory
		invalidProduct = new Product("samsung galaxy", "samsung", 2, 800.0);
		invalidQuantity = new Product("ipad4", "ipad", 10, 600.0);
		controller = new OrderPlacementController();
		controller.setOrderService(new OrderServiceFacadeImpl());
	}
	

	@Test
    public void testValidProduct() throws Exception {
		System.out.println("Valid Product use case.....");
        boolean result = controller.placeOrder(user, product);
        Assert.assertTrue(result);
    }
	
	@Test
    public void testInvalidPorduct() throws Exception {
		System.out.println("Invalid Product use case.....");
        boolean result = controller.placeOrder(user, invalidProduct);
        Assert.assertFalse(result);
    }
	
	@Test
    public void testInvalidPorductQuantity() throws Exception {
		System.out.println("Invalid Product Quantity use case.....");
        boolean result = controller.placeOrder(user, invalidQuantity);
        Assert.assertFalse(result);
    }
}
