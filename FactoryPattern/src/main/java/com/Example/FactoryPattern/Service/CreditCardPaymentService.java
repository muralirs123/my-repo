package com.Example.FactoryPattern.Service;

import org.springframework.stereotype.Service;

@Service("creditCard")
public class CreditCardPaymentService implements PaymentService {
    @Override
    public String processPayment(double amount) {
        return "Payment of " + amount + " processed using Credit Card.";
    }
}


