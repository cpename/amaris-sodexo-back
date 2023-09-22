package com.cpena.amaris.sodexo.back.web.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cpena.amaris.sodexo.back.service.business.UsuarioSevice;
import com.cpena.amaris.sodexo.back.service.dtos.UsuarioDto;
import com.cpena.amaris.sodexo.back.service.dtos.UsuarioUpdateDto;


import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
@Validated
public class UserController {
	
	@Autowired
	private final UsuarioSevice usuarioService;
	
	@GetMapping( value = "/usuarios", produces = MediaType.APPLICATION_JSON_VALUE )
	public ResponseEntity<List<UsuarioDto> > getUsers(){
		
		List<UsuarioDto> usuariosDto = usuarioService.getUsers();
		
		return ResponseEntity.ok(usuariosDto);
	}
	
	@PostMapping(value = "/usuarios", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<UsuarioDto> createUsuario(@RequestBody UsuarioDto usuarioDto){
		
		UsuarioDto nuevoUsuarioDto = usuarioService.createUsuario(usuarioDto);
		
		return ResponseEntity.ok(nuevoUsuarioDto);
	}
	
	@PutMapping(value = "/usuarios/{usuarioId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<UsuarioDto> modificaUsuario(@RequestBody UsuarioUpdateDto usuarioUpdate,
			@PathVariable Long usuarioId){
		
		UsuarioDto usuarioDto = usuarioService.updateUsuario(usuarioUpdate, usuarioId);
		
		return ResponseEntity.ok(usuarioDto);
	}
	
	@DeleteMapping(value = "/usuarios/{usuarioId}/delete", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseEntity<?> borraUsuario(@PathVariable Long usuarioId){
		usuarioService.borrarUsuario(usuarioId);
		
		return ResponseEntity.noContent().build();
		
	}
	
	
	
}
