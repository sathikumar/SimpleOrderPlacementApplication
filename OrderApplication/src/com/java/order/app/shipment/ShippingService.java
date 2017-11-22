package com.java.order.app.shipment;

import com.java.order.app.product.Product;

/**
 * @author sathishkumar
 *
 */
public interface ShippingService {

	public boolean sendNotificationForShipment(String address, Product product);
}
