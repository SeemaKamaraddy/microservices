package com.bloomberg.clientservice.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ExceptionControllerAdvice extends ResponseEntityExceptionHandler {

	public static final Logger logger = LoggerFactory.getLogger(ExceptionControllerAdvice.class);

	@ExceptionHandler(Exception.class)
	protected ResponseEntity<Object> handleConflict(Exception ex, WebRequest request) {
		logger.info("Inside ExceptionControllerAdvice of second server");
		String bodyOfResponse = ex.getMessage();
		HttpClientErrorException httpClientError = null;
		if (ex instanceof HttpClientErrorException) {
			httpClientError = (HttpClientErrorException) ex;
		}
		return new ResponseEntity<>(bodyOfResponse, httpClientError.getStatusCode());
		// return handleExceptionInternal(ex, bodyOfResponse, new HttpHeaders(),
		// HttpStatus.CONFLICT, request);
	}
}
