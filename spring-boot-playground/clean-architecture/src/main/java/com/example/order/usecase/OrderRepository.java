package com.example.order.usecase;

import com.example.order.domain.Order;

public interface OrderRepository {
  void save(Order order);
  Order findById(String orderId);
}
