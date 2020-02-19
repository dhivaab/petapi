package com.blueocean.ShoppingCart.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.blueocean.ShoppingCart.model.Orders;

@Repository
public interface OrderRepository extends CrudRepository<Orders, Integer> {

}
