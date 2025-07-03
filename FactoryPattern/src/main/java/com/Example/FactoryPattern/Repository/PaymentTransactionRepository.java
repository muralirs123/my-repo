package com.Example.FactoryPattern.Repository;

import com.Example.FactoryPattern.Entity.PaymentTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentTransactionRepository extends JpaRepository<PaymentTransaction, Long> {
}
