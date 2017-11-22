package com.java.order.app.facade;

import com.java.order.app.payment.PaymentService;
import com.java.order.app.payment.PaymentServiceImpl;
import com.java.order.app.product.Product;
import com.java.order.app.product.inventory.InventoryService;
import com.java.order.app.product.inventory.InventoryServiceImpl;
import com.java.order.app.shipment.ShippingService;
import com.java.order.app.shipment.ShippingServiceImpl;
import com.java.order.app.user.User;

/**
 * 
 * A simple facade that takes care of checking the inventory, making a payment and sending notification 
 * to shipping department for shipment of the order placed.
 * 
 * @author sathishkumar
 *
 */
public class OrderServiceFacadeImpl implements OrderServiceFacade {

	public InventoryService inventoryService = new InventoryServiceImpl();
	public PaymentService paymentService = new PaymentServiceImpl();
	public ShippingService shippingService = new ShippingServiceImpl();
	
	@Override
	public boolean placeOrder(User user, Product product) {
		boolean isOrderPlaced = false;
		if(inventoryService.checkInventory(product.getProductId(), product.getQuantity())) {
			System.out.println("Product with ID: "+ product.productId+" is available.");
			Double amount = product.getPrice() * product.getQuantity();
			boolean paymentConfirmed = paymentService.chargePayment(user.getCreditCardNumber(), amount);
			if(paymentConfirmed) {
				System.out.println("Payment confirmed...");
				shippingService.sendNotificationForShipment(user.getPhysicalAddress(), product);
                System.out.println("Product shipped...");
                isOrderPlaced = true;
			}
		}
		return isOrderPlaced;
	}

}
