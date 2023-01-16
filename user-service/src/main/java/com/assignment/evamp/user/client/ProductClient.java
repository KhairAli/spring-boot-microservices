package com.assignment.evamp.user.client;

import com.assignment.evamp.user.client.response.ProductResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "product-service", url="http://192.168.10.29:8084/")
public interface ProductClient {

	@GetMapping(value = "/v1/product/test")
	String getUserProduct();

	@GetMapping(value = "/v1/product/name/{name}")
	ProductResponse getProductByName(@PathVariable("name") String name);

}
