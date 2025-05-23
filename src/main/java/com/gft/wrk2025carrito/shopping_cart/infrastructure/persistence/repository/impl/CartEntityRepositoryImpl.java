package com.gft.wrk2025carrito.shopping_cart.infrastructure.persistence.repository.impl;

import com.gft.wrk2025carrito.shopping_cart.domain.repository.CartRepository;
import com.gft.wrk2025carrito.shopping_cart.infrastructure.persistence.repository.CartEntityJpaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
@AllArgsConstructor()
public class CartEntityRepositoryImpl implements CartRepository {

    private final CartEntityJpaRepository jpaRepository;

    @Override
    public void deleteById(UUID id) {
        jpaRepository.deleteById(id);
    }

    @Override
    public boolean existsById(UUID id) {
        return jpaRepository.existsById(id);
    }
}
