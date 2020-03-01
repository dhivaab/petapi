package com.blueocean.ShoppingCart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blueocean.ShoppingCart.model.Orderdetail;

@Repository
public interface OrderdetailRepository extends JpaRepository<Orderdetail, Integer> {

}
