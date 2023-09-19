package com.cpena.amaris.sodexo.back.web.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cpena.amaris.sodexo.back.service.business.ComunaService;
import com.cpena.amaris.sodexo.back.service.dtos.ComunaDto;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@Validated
@RequestMapping("/api/v1/comunas")
public class ComunaController {
	
	@Autowired
	private final ComunaService comunaService;

	@GetMapping( value = "", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<ComunaDto>> getComunas(){
		List<ComunaDto> comunasDto = comunaService.getComunas();
		
		return ResponseEntity.ok(comunasDto);
	}
}
