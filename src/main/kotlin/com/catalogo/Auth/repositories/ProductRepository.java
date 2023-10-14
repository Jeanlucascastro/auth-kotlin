package com.catalogo.Auth.repositories;

import com.catalogo.Auth.domain.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {
}
