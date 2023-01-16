package com.assignment.evamp.product.controller;

import com.assignment.evamp.product.domain.Product;
import com.assignment.evamp.product.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/product")
public class ProductController {

	Logger logger = LoggerFactory.getLogger(ProductController.class);

	@Autowired
	ProductService productService;

	@GetMapping("/test")
	public String read() {
		return productService.getProductName();
	}

	@GetMapping("/name/{name}")
	public Product name(@PathVariable("name") String name) {
		logger.info(name);
		return productService.getProductByName(name);
	}

	@GetMapping("/count")
	public Long count() {
		return productService.getProductCount();
	}
}
