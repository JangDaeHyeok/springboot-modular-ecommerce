package com.modularEcommerce.order.service;

import com.modularEcommerce.order.domain.Order;
import com.modularEcommerce.order.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;

    @Transactional
    public Order createOrder(Long userId, Long productId) {
        Order order = Order.builder()
                .userId(userId)
                .productId(productId)
                .orderedAt(LocalDateTime.now())
                .build();

        return orderRepository.save(order);
    }

}
