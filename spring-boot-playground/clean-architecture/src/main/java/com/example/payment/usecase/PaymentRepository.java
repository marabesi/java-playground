package com.example.payment.usecase;

import com.example.payment.domain.Payment;

public interface PaymentRepository {
  void save(Payment payment);
  Payment findByOrderId(String orderId);
}
