package com.example.order.domain;

import java.math.BigDecimal;

enum OrderStatus {
  PENDING, CONFIRMED, SHIPPED, DELIVERED
}

public class Order {
  private final String orderId;
  private final String customerId;
  private final BigDecimal totalAmount;
  private OrderStatus status;

  public Order(String orderId, String customerId, BigDecimal totalAmount) {
    this.orderId = orderId;
    this.customerId = customerId;
    this.totalAmount = totalAmount;
    this.status = OrderStatus.PENDING;
  }

  public void confirm() {
    this.status = OrderStatus.CONFIRMED;
  }

  // Getters
  public String getOrderId() { return orderId; }
  public String getCustomerId() { return customerId; }
  public BigDecimal getTotalAmount() { return totalAmount; }
  public OrderStatus getStatus() { return status; }
}
