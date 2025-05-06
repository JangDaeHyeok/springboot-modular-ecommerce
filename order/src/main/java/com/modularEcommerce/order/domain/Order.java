package com.modularEcommerce.order.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "`order`")
public class Order {

    @Id
    @GeneratedValue
    private Long id;

    private Long userId;

    private Long productId;

    private LocalDateTime orderedAt;

}
