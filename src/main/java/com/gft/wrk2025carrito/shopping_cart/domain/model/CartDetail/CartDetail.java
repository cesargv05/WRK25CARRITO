package com.gft.wrk2025carrito.shopping_cart.domain.model.CartDetail;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class CartDetail {

    private UUID productId;
    private int quantity;
    private BigDecimal totalPrice;
    private double totalWeight;


    public static CartDetail build(UUID productId, int quantity, BigDecimal totalPrice, double totalWeight) {

        if(productId == null){
            throw new IllegalArgumentException("Product ID cannot be null");
        }

        if (totalPrice.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }

        if (totalWeight < 0) {
            throw new IllegalArgumentException("Weight cannot be negative");
        }

        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity cannot be negative");
        }

        return new CartDetail(productId, quantity, totalPrice, totalWeight);
    }
}
