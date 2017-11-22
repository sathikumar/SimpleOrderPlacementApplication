package com.java.order.app.shipment;

import com.java.order.app.product.Product;

/**
 * @author sathishkumar
 *
 */
public class ShippingServiceImpl implements ShippingService {

	@Override
	public boolean sendNotificationForShipment(String address, Product product) {

		// For simplicity I am returning true, otherwise will make a service call to send notification to shipping department
		// with detail of physical address and details of product to be shipped.
		return true;
	}

}
