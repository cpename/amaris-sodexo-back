package com.cpena.amaris.sodexo.back.service.exceptions;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SodexoError {
	private String errorMessage;
	private String errorCode;

	public SodexoError(String errorMessage, String errorCode) {
		this.errorMessage = errorMessage;
		this.errorCode = errorCode;
	}

	public SodexoError(String errorMessage) {
		this.errorMessage = errorMessage;
	}
}
