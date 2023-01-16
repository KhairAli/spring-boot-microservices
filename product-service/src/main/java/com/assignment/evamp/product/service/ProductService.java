package com.assignment.evamp.product.service;

import com.assignment.evamp.product.controller.ProductController;
import com.assignment.evamp.product.domain.Product;
import com.assignment.evamp.product.repository.ProductRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

	Logger logger = LoggerFactory.getLogger(ProductService.class);

	@Autowired
	ProductRepository productRepository;

	public String getProductName() {
		return "I am chocolate product";
	}
	public Long getProductCount() {
		return productRepository.count();
	}
	public Product getProductByName(String name) {
		Product product = productRepository.findItemByName(name);
		if(product!=null && product.getAvailable() ==null){
			product.setAvailable(false);
		}
		logger.info("Product: {}",product.toString());
		return product;
	}

}
