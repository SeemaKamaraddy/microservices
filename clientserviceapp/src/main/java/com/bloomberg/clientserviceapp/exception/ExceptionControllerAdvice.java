package com.bloomberg.clientserviceapp.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.bloomberg.clientserviceapp.service.MathService;

@ControllerAdvice
public class ExceptionControllerAdvice extends ResponseEntityExceptionHandler {

	public static final Logger logger = LoggerFactory.getLogger(ExceptionControllerAdvice.class);

	@ExceptionHandler(MultiplicationException.class)
	protected ResponseEntity<Object> handleConflict(MultiplicationException ex, WebRequest request) {
		logger.info("Inside ExceptionControllerAdvice of second server");
		String bodyOfResponse = ex.getErrMsg();
		return new ResponseEntity<>(bodyOfResponse, HttpStatus.BAD_REQUEST);
		//return handleExceptionInternal(ex, bodyOfResponse, new HttpHeaders(), HttpStatus.CONFLICT, request);
	}
}
