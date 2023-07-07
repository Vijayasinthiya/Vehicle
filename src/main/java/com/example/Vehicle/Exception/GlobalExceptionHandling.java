package com.example.Vehicle.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandling {
	@ExceptionHandler(value = BrandException.class)
	public ResponseEntity<Object> brandNotFound(BrandException be) {
		return new ResponseEntity<>(be.getMessage(), HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(value=ColourException.class)
	public ResponseEntity<Object> colourNotMatch(ColourException ce){
		return new ResponseEntity<>(ce.getMessage(),HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(value=PriceException.class)
	public ResponseEntity<Object> priceNotEqual(PriceException pe){
		return new ResponseEntity<>(pe.getMessage(),HttpStatus.NOT_FOUND);
	}
}
