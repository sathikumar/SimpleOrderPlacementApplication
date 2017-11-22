package com.java.order.app.product.inventory;

import java.util.HashMap;
import java.util.Map;

/**
 * @author sathishkumar
 *
 */
public class InventoryServiceImpl implements InventoryService {

	public static Map<String, Integer> PRODUCT_AVAILABILITY = new HashMap<>();
	
	static {
		PRODUCT_AVAILABILITY.put("iphone8", 5);
		PRODUCT_AVAILABILITY.put("macbook pro", 8);
		PRODUCT_AVAILABILITY.put("ipad4", 9);
		PRODUCT_AVAILABILITY.put("appletv2", 10);
	}
	
	@Override
	public boolean checkInventory(String productId, int quantity) {
		// For simplicity I am using map to mock data availability, otherwise make a DB call (DAO/DAOImpl) 
		// to check the available quantity in inventory.
		for (Map.Entry<String, Integer> entry : PRODUCT_AVAILABILITY.entrySet()) {
		    String productIdentifier = entry.getKey();
		    if(productIdentifier.equals(productId) && entry.getValue() >= quantity) {
		    		return true;
		    }
		}
		return false;
	}

}
