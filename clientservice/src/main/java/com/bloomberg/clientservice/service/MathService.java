package com.bloomberg.clientservice.service;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.bloomberg.clientservice.ClientServiceAppProxy;


@Service
public class MathService {

	public static final Logger logger = LoggerFactory.getLogger(MathService.class);
	
	/*
	 * @Value("${client-service.routeUrl}") private String serviceUrl;
	 */

	@Autowired
	private ClientServiceAppProxy clientServiceAppProxy;
	
	public ResponseEntity<Integer> multiply(int a ,int b) {
		logger.info("Inside Clientservice first server : MathService");
		return getMultiplication(a,b);
	}
	
	/*
	 * private ResponseEntity<Integer> getMultiplication(int a,int b) {
	 * logger.info("Math Operation Service URL:"+serviceUrl); Map<String, Integer>
	 * params = new HashMap<String, Integer>(); params.put("num1", a);
	 * params.put("num2", b);
	 * 
	 * RestTemplate restTemplate = new RestTemplate(); ResponseEntity<Integer>
	 * result = restTemplate.getForEntity(serviceUrl, Integer.class, params);
	 * 
	 * System.out.println("Result from the rest service:"+result); return result; }
	 */
	
	public ResponseEntity<Integer> getMultiplication(int a,int b){
		int result = clientServiceAppProxy.multiply(a, b);
		return new ResponseEntity<Integer>(result,HttpStatus.OK);
	}
}
