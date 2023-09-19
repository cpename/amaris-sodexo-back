package com.cpena.amaris.sodexo.back.service.business;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cpena.amaris.sodexo.back.domain.entities.Usuario;
import com.cpena.amaris.sodexo.back.domain.repositories.UsuarioRepository;
import com.cpena.amaris.sodexo.back.service.dtos.UsuarioDto;
import com.cpena.amaris.sodexo.back.service.utils.GeneralUtils;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserSevice {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private GeneralUtils generalUtils;
	
	public List<UsuarioDto> getUsers() {
		List<Usuario> usuarios =  usuarioRepository.findAll();
		
		List<UsuarioDto> usuariosDto =  generalUtils.convertUsuariosToUsuariosDto(usuarios);
		
		return usuariosDto;
	}
	
	
}
