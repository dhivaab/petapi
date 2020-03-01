package com.blueocean.ShoppingCart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blueocean.ShoppingCart.model.Office;

@Repository
public interface OfficeRepository extends JpaRepository<Office, String> {

}
