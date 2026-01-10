package com.example.order.usecase;

import java.math.BigDecimal;

// Interface for inter-module communication
public interface PaymentNotifier {
  void notifyPaymentRequired(String orderId, BigDecimal amount);
}
