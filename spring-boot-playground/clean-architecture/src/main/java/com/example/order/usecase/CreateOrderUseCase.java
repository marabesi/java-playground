package com.example.order.usecase;

import com.example.order.domain.Order;

import java.math.BigDecimal;
import java.util.UUID;

public class CreateOrderUseCase {
  private final OrderRepository orderRepository;
  private final PaymentNotifier paymentNotifier;

  public CreateOrderUseCase(OrderRepository orderRepository,
                            PaymentNotifier paymentNotifier) {
    this.orderRepository = orderRepository;
    this.paymentNotifier = paymentNotifier;
  }

  public Order execute(String customerId, BigDecimal amount) {
    Order order = new Order(
        generateOrderId(),
        customerId,
        amount
    );
    orderRepository.save(order);

    // Notify payment module through interface
    paymentNotifier.notifyPaymentRequired(
        order.getOrderId(),
        order.getTotalAmount()
    );

    return order;
  }

  private String generateOrderId() {
    return "ORD-" + UUID.randomUUID().toString();
  }
}

