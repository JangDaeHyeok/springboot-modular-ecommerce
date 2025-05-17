package com.modularEcommerce.order.service;

import com.modularEcommerce.common.event.ProductUsedEvent;
import com.modularEcommerce.order.domain.Order;
import com.modularEcommerce.order.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final ApplicationEventPublisher publisher;

    private final OrderRepository orderRepository;

    @Transactional
    public Order createOrder(Long userId, Long productId) {
        Order order = Order.builder()
                .userId(userId)
                .productId(productId)
                .orderedAt(LocalDateTime.now())
                .build();

        // publish product event
        System.out.println(">> publish event");
        publisher.publishEvent(new ProductUsedEvent(productId));

        return orderRepository.save(order);
    }

}
