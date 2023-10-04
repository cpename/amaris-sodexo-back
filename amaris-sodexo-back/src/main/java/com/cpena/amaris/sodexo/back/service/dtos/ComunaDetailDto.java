package com.cpena.amaris.sodexo.back.service.dtos;

import lombok.Data;

@Data
public class ComunaDetailDto {
	
    private String name;
    private String code;
    private ContainedIn contained_in;

}
