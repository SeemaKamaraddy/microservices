package com.bloomberg.clientservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.bloomberg.clientservice.service.MathService;

@RestController
public class MathOperation {

	public static final Logger logger = LoggerFactory.getLogger(MathOperation.class);
	
	@Autowired
	private MathService mathService;
	
	@GetMapping("/product/{num1}/{num2}")
	public ResponseEntity<Integer> multiply(@PathVariable int num1, @PathVariable int num2) {
		logger.info("Inside Clientservice first server : MathOperation");
		return mathService.multiply(num1, num2);
	}
	
	@GetMapping("/product/feign/{num1}/{num2}")
	public ResponseEntity<Integer> multiplyFeign(@PathVariable int num1, @PathVariable int num2) {
		logger.info("Inside Clientservice first server : MathOperation");
		return mathService.getMultiplicationfromFeign(num1, num2);
	}
}
