package com.example.payment.usecase;

import com.example.payment.domain.Payment;

import java.math.BigDecimal;
import java.util.UUID;

public class ProcessPaymentUseCase {
  private final PaymentRepository paymentRepository;

  public ProcessPaymentUseCase(PaymentRepository paymentRepository) {
    this.paymentRepository = paymentRepository;
  }

  public Payment execute(String orderId, BigDecimal amount) {
    Payment payment = new Payment(
        generatePaymentId(),
        orderId,
        amount
    );

    // Process payment logic
    payment.process();
    paymentRepository.save(payment);

    return payment;
  }

  private String generatePaymentId() {
    return "PAY-" + UUID.randomUUID().toString();
  }
}
