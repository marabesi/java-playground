package com.example.demo;

import com.example.order.infrastructure.PaymentNotifierAdapter;
import com.example.order.usecase.CreateOrderUseCase;
import com.example.order.usecase.OrderRepository;
import com.example.payment.usecase.PaymentRepository;
import com.example.payment.usecase.ProcessPaymentUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@org.springframework.web.bind.annotation.RestController
public class DemoController {

  @Autowired
  private final OrderRepository orderRepository;

  @Autowired
  private final PaymentRepository paymentRepository;

  public DemoController(OrderRepository orderRepository, PaymentRepository paymentRepository) {
    this.orderRepository = orderRepository;
    this.paymentRepository = paymentRepository;
  }

  @GetMapping
  public String get() {
    return "hello";
  }

  @PostMapping
  public CreateOrderUseCase createOrder() {
      ProcessPaymentUseCase processPayment = new ProcessPaymentUseCase(paymentRepository);

      PaymentNotifierAdapter paymentNotifier = new PaymentNotifierAdapter(processPayment);

      return new CreateOrderUseCase(orderRepository, paymentNotifier);
  }
}
