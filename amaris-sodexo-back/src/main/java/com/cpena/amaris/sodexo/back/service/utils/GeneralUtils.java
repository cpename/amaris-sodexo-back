package com.cpena.amaris.sodexo.back.service.utils;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.cpena.amaris.sodexo.back.domain.entities.Usuario;
import com.cpena.amaris.sodexo.back.service.dtos.UsuarioDto;

import lombok.NoArgsConstructor;

@NoArgsConstructor
@Component
public class GeneralUtils {

	private ModelMapper modelMapper = new ModelMapper();
	
	/**
	 * Retorna un UsuarioDto a partir del Usuario Entity
	 * @param usuario Entity
	 * @return UsuarioDto
	 */
	public UsuarioDto convertUserToUserDto( Usuario usuario ) {
		UsuarioDto usuarioDto = modelMapper.map(usuario, UsuarioDto.class);
		
		return usuarioDto;
	}
	
	/**
	 * Convierte a Usuario Entity a partir de un UsuarioDto 
	 * @param usuarioDto
	 * @return
	 */
	public Usuario convertUsuarioDtoToUsuario( UsuarioDto usuarioDto ) {
		
		Usuario usuario = modelMapper.map(usuarioDto, Usuario.class);
		
		return usuario;
	}
	
	/**
	 * Convierte lista de usuarios entity a lista de usuariosDto
	 * @param usuarios List<Usuario> 
	 * @return List<UsuarioDto> usuariosDto
	 */
	public List<UsuarioDto> convertUsuariosToUsuariosDto( List<Usuario> usuarios ){
		List<UsuarioDto> usuariosDto = usuarios.stream()
				.map( usuario ->  modelMapper.map(usuario, UsuarioDto.class) )
				.collect(Collectors.toList());
		
		return usuariosDto;
	}
	
	
}
