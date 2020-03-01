package com.blueocean.ShoppingCart.service;

import java.util.List;
import com.blueocean.ShoppingCart.model.Product;
import com.blueocean.ShoppingCart.model.ProductLine;

public interface ProductService {

	 List<Product> getAllProducts();
	    
	 Product getProduct(String productCode);
	 
	 List<ProductLine> getProductLines();
}
