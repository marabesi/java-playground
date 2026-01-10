package com.example.order.infrastructure;

import com.example.order.usecase.PaymentNotifier;
import com.example.payment.usecase.ProcessPaymentUseCase;

import java.math.BigDecimal;

public class PaymentNotifierAdapter implements PaymentNotifier {
  private final ProcessPaymentUseCase processPaymentUseCase;

  public PaymentNotifierAdapter(ProcessPaymentUseCase processPaymentUseCase) {
    this.processPaymentUseCase = processPaymentUseCase;
  }

  @Override
  public void notifyPaymentRequired(String orderId, BigDecimal amount) {
    processPaymentUseCase.execute(orderId, amount);
  }
}
