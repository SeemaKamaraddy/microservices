package com.bloomberg.clientserviceapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bloomberg.clientserviceapp.service.MathService;


@RestController
@RequestMapping("/clientServiceApp")
public class MathOperation {

	public static final Logger logger = LoggerFactory.getLogger(MathOperation.class);
	
	@Autowired
	private MathService mathService;
	
	@GetMapping("/product/{num1}/{num2}")
	public ResponseEntity<Integer> multiply(@PathVariable int num1, @PathVariable int num2) {
		logger.info("Inside Clientservice Second server : MathOperation");
		int result = mathService.multiply(num1, num2);
		return new ResponseEntity<Integer>(result,HttpStatus.OK);
	}
}
