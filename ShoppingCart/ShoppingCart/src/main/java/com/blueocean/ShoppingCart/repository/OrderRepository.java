package com.blueocean.ShoppingCart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blueocean.ShoppingCart.model.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {

}
