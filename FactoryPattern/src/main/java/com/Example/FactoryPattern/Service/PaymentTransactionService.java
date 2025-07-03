package com.Example.FactoryPattern.Service;

import com.Example.FactoryPattern.Entity.PaymentTransaction;
import com.Example.FactoryPattern.Repository.PaymentTransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentTransactionService {

    @Autowired
    private PaymentTransactionRepository repository;

    public void saveTransaction(String paymentType, double amount, String status) {
        PaymentTransaction transaction = new PaymentTransaction();
        transaction.setPaymentType(paymentType);
        transaction.setAmount(amount);
        transaction.setStatus(status);
        repository.save(transaction);
    }
}
