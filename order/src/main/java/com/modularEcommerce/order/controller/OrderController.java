package com.modularEcommerce.order.controller;

import com.modularEcommerce.order.domain.Order;
import com.modularEcommerce.order.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("orders")
public class OrderController {

    private final OrderService orderService;

    @PostMapping
    public Order createOrder(@RequestParam(name = "userId") Long userId, @RequestParam(name = "productId") Long productId) {
        return orderService.createOrder(userId, productId);
    }

}
