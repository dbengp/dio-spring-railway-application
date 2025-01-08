package org.sample.railwayapplication.controller.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.NoSuchElementException;

@RestControllerAdvice
public class GlobalExceptionHandler {

	private final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);
	
	@ExceptionHandler(IllegalArgumentException.class)
	public ResponseEntity<String> businessExceptionHandle(IllegalArgumentException businessException){
		return new ResponseEntity<>(businessException.getMessage(), HttpStatus.UNPROCESSABLE_ENTITY);
	}
	
	@ExceptionHandler(NoSuchElementException.class)
	public ResponseEntity<String> notFoundExceptionHandle(NoSuchElementException notFoundException){
		return new ResponseEntity<>("Recurso não encontrado.", HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(Throwable.class)
	public ResponseEntity<String> unexpectedExceptionHandle(Throwable unexpectedException){
		logger.error("", unexpectedException);
		return new ResponseEntity<>("Houve um erro no serviço, estamos atuando para corrigir isso.", HttpStatus.INTERNAL_SERVER_ERROR);
	}
}