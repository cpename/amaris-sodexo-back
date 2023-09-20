package com.cpena.amaris.sodexo.back.service.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum ErrorMessageEnum {

	USUARIO_NO_REGISTRADO("USUARIO_01", "Empresa ya existe registrada"),
	USUARIO_ID_NOT_FOUND("USUARIO_02", "Usuario id no existe");
	
	private final String code;
	private final String message;
	
}
