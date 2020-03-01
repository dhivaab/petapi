package com.blueocean.ShoppingCart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blueocean.ShoppingCart.model.ProductLine;

@Repository
public interface ProductLineRepository extends JpaRepository<ProductLine, String>{

}
