package com.cpena.amaris.sodexo.back.service.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.web.server.ResponseStatusException;

import com.cpena.amaris.sodexo.back.service.enums.ErrorMessageEnum;


public class SodexoException extends ResponseStatusException {

	private static final long serialVersionUID = 1L;
	private final transient SodexoError error ;
	
	public SodexoException( HttpStatus status, String reason ) {
		super(status,reason);
		this.error = new SodexoError(reason);
		
		
	}

	public SodexoException(HttpStatusCode status, String reason, Throwable cause) {
		super(status, reason, cause);
		this.error = new SodexoError(reason);
	}
	
	public SodexoException( HttpStatus status, ErrorMessageEnum error ) {
		super(status, error.getMessage());
		this.error = new SodexoError(error.getMessage(), error.getCode());
	}
	
	public SodexoException( HttpStatus status, ErrorMessageEnum error, Throwable cause ) {
		super(status, error.getMessage(), cause);
		this.error = new SodexoError(error.getMessage(), error.getCode());
		
	}
}
