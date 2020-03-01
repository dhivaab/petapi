package com.blueocean.ShoppingCart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.blueocean.ShoppingCart.model.Product;
import com.blueocean.ShoppingCart.model.ProductLine;
import com.blueocean.ShoppingCart.service.ProductService;

@RestController
@RequestMapping("/api/v1")
public class ProductController {

	@Autowired
	private ProductService productservice;
	
	@GetMapping("/products")
	ResponseEntity<?> getAllProducts() 
	{
		try 
		{
			List<Product> products = productservice.getAllProducts();
			return new ResponseEntity<List<Product>>(products,HttpStatus.OK);
			
		}
		catch(Exception ex)
		{
			return new ResponseEntity<String>(ex.getMessage(),HttpStatus.NOT_FOUND);
		}
	}
	@GetMapping("/productlines")
	ResponseEntity<?> getAllproductlines() 
	{
		try 
		{
			List<ProductLine> productlines = productservice.getProductLines();
			return new ResponseEntity<List<ProductLine>>(productlines,HttpStatus.OK);
			
		}
		catch(Exception ex)
		{
			return new ResponseEntity<String>(ex.getMessage(),HttpStatus.NOT_FOUND);
		}
	}
	
}
