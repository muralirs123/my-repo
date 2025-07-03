package com.Example.FactoryPattern.Controller;

import com.Example.FactoryPattern.Factory.PaymentServiceFactory;
import com.Example.FactoryPattern.Service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private PaymentServiceFactory paymentServiceFactory;

    @GetMapping("/{paymentType}/{amount}")
    public String processPayment(@PathVariable String paymentType, @PathVariable double amount) {
        PaymentService paymentService = paymentServiceFactory.getPaymentService(paymentType);
        return paymentService.processPayment(amount);
    }
}
