package com.blueocean.ShoppingCart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blueocean.ShoppingCart.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
