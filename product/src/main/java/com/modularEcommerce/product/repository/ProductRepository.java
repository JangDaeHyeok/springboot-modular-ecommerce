package com.modularEcommerce.product.repository;

import com.modularEcommerce.product.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
