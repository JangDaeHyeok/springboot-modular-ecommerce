package com.modularEcommerce.product.event;

import com.modularEcommerce.common.event.ProductUsedEvent;
import com.modularEcommerce.product.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ProductEventHandler {

    private final ProductRepository productRepository;

    @EventListener
    public void handleProductUsed(ProductUsedEvent event) {
        System.out.println("✅ 이벤트 수신됨: " + event.id());

        // Product 사용 로직
        productRepository.findById(event.id()).ifPresent(product -> System.out.println("== Product == : " + product));
    }
}
