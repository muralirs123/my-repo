package com.Example.FactoryPattern.Factory;

import com.Example.FactoryPattern.Service.PaymentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class PaymentServiceFactory {
    @Autowired
    private ApplicationContext applicationContext;

    public PaymentService getPaymentService(String paymentType) {
        if (!applicationContext.containsBean(paymentType)) {
            throw new IllegalArgumentException("Invalid payment type: " + paymentType);
        }
        return applicationContext.getBean(paymentType, PaymentService.class);
    }
}
