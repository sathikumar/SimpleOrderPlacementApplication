package com.java.order.app.product.inventory;

/**
 * @author sathishkumar
 *
 */
public interface InventoryService {

	boolean checkInventory(String productId, int quantity);
	
}
