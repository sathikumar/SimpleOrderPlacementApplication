package com.java.order.app.payment;

/**
 * @author sathishkumar
 *
 */
public interface PaymentService {

	public boolean chargePayment(String creditCardNumber, Double amount);
}
