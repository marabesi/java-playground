package com.example.order.usecase;

import com.example.order.domain.Order;

public class OrderInMemory implements OrderRepository {
  @Override
  public void save(Order order) {

  }

  @Override
  public Order findById(String orderId) {
    return null;
  }
}
