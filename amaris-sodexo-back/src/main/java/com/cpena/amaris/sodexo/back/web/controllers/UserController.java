package com.cpena.amaris.sodexo.back.web.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cpena.amaris.sodexo.back.service.business.UserSevice;
import com.cpena.amaris.sodexo.back.service.dtos.UsuarioDto;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
@Validated
public class UserController {
	
	@Autowired
	private final UserSevice usuarioService;
	
	@GetMapping( value = "/usuarios", produces = MediaType.APPLICATION_JSON_VALUE )
	public ResponseEntity<List<UsuarioDto> > getUsers(){
		
		List<UsuarioDto> usuariosDto = usuarioService.getUsers();
		
		return ResponseEntity.ok(usuariosDto);
	}
	
}
