package com.modularEcommerce.order.repository;

import com.modularEcommerce.order.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
