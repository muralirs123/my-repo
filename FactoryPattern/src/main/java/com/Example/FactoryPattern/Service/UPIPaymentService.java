package com.Example.FactoryPattern.Service;

import org.springframework.stereotype.Service;

@Service("upi")
public class UPIPaymentService implements PaymentService {
    @Override
    public String processPayment(double amount) {
        return "Payment of " + amount + " processed using UPI.";
    }
}
