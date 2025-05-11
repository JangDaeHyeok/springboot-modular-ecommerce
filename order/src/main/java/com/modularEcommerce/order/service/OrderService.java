package com.modularEcommerce.order.service;

import com.modularEcommerce.order.domain.Order;
import com.modularEcommerce.order.repository.OrderRepository;
import com.modularEcommerce.product.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class OrderService {

    // 모듈에서 모듈 참조하면 docs 연관관계 출력됨
    private final ProductService productService;

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
