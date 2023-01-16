package com.assignment.evamp.user.controller;

import com.assignment.evamp.user.client.dto.PurchaseDTO;
import com.assignment.evamp.user.service.UserService;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/user")
public class UserController {

	Logger logger = LoggerFactory.getLogger(UserController.class);

	@Autowired
	private UserService userService;

	@GetMapping("/test")
	public String test(){
		return userService.getUserProduct();
	}

	@GetMapping("/purchase/{productName}")
	public PurchaseDTO purchase(
			@ApiParam( value ="AC3 Phone,AC3 Series Charger, AC7 Phone etc are the Products which are available on database")
			@PathVariable("productName") String name
	){
		logger.info(name);
		return userService.purchaseProduct(name);
	}

}
