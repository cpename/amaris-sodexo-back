package com.cpena.amaris.sodexo.back.service.dtos;

import lombok.Data;

@Data
public class ComunaDto {
	private String name;
	private String code;
	private ProvinciaDto contained_in;
	
}
