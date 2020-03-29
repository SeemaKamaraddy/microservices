package com.bloomberg.clientserviceapp.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.bloomberg.clientserviceapp.exception.MultiplicationException;

@Service
public class MathService {

	public static final Logger logger = LoggerFactory.getLogger(MathService.class);

	public int multiply(int a, int b) {
		logger.info("Inside Clientservice Second server : MathService");
		if(a==0 || b==0) {
			throw new MultiplicationException("ERR01", "The numbers cannot be zero for multiplication operation");
		}
		return a * b;
	}

}
