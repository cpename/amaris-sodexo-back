package com.cpena.amaris.sodexo.back.service.business;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cpena.amaris.sodexo.back.service.dtos.ComunaDto;
import com.cpena.amaris.sodexo.back.service.interfaces.IComunaService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ComunaService {
	
	private final IComunaService comunaClient;
	
	public List<ComunaDto> getComunas(){
		return comunaClient.getComunas();
	}
	
	public ComunaDto getComunaByCode( String id ) {
		
		return comunaClient.getComunaByCode(id);
	}
	
}
