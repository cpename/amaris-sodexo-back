package com.cpena.amaris.sodexo.back.service.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum ErrorMessageEnum {

	USUARIO_NO_REGISTRADO("EMPRESA_01", "Empresa ya existe registrada");
	
	private final String code;
	private final String message;
	
}
