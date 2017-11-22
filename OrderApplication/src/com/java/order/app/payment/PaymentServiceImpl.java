package com.java.order.app.payment;

/**
 * @author sathishkumar
 *
 */
public class PaymentServiceImpl implements PaymentService {

	@Override
	public boolean chargePayment(String creditCardNumber, Double amount) {
		
		// For Simplicity I am returning true always, otherwise will call third party service to make payment and charge fee accordingly.
		return true;
	}

}
