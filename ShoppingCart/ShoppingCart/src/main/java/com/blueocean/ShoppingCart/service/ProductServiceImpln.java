package com.blueocean.ShoppingCart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blueocean.ShoppingCart.model.Product;
import com.blueocean.ShoppingCart.model.ProductLine;
import com.blueocean.ShoppingCart.repository.ProductLineRepository;
import com.blueocean.ShoppingCart.repository.ProductRepository;

@Service
public class ProductServiceImpln implements ProductService {

	@Autowired
	private ProductRepository productrepo;
	
	@Autowired
	private ProductLineRepository productlinerepo;
	
	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return productrepo.findAll();
	}

	@Override
	public Product getProduct(String productCode) {
		// TODO Auto-generated method stub
		return productrepo.findById(productCode).orElse(null);
	}

	@Override
	public List<ProductLine> getProductLines() {
		// TODO Auto-generated method stub
		return productlinerepo.findAll();
	}

}
