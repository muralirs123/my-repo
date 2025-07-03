package com.Example.FactoryPattern.Service;

import org.springframework.stereotype.Service;

@Service("paypal")
public class PayPalPaymentService implements PaymentService {
    @Override
    public String processPayment(double amount) {
        return "Payment of " + amount + " processed using PayPal.";
    }
}

