package com.example.payment.domain;

import java.math.BigDecimal;

enum PaymentStatus {
  PENDING, PROCESSED, FAILED, REFUNDED
}

public class Payment {
  private final String paymentId;
  private final String orderId;
  private final BigDecimal amount;
  private PaymentStatus status;

  public Payment(String paymentId, String orderId, BigDecimal amount) {
    this.paymentId = paymentId;
    this.orderId = orderId;
    this.amount = amount;
    this.status = PaymentStatus.PENDING;
  }

  public void process() {
    this.status = PaymentStatus.PROCESSED;
  }

  // Getters
  public String getPaymentId() { return paymentId; }
  public String getOrderId() { return orderId; }
  public BigDecimal getAmount() { return amount; }
  public PaymentStatus getStatus() { return status; }
}
