package com.cpena.amaris.sodexo.back.service.business;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.cpena.amaris.sodexo.back.domain.entities.Usuario;
import com.cpena.amaris.sodexo.back.domain.repositories.UsuarioRepository;
import com.cpena.amaris.sodexo.back.service.dtos.UsuarioDto;
import com.cpena.amaris.sodexo.back.service.dtos.UsuarioUpdateDto;
import com.cpena.amaris.sodexo.back.service.enums.ErrorMessageEnum;
import com.cpena.amaris.sodexo.back.service.exceptions.SodexoException;
import com.cpena.amaris.sodexo.back.service.utils.GeneralUtils;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UsuarioSevice {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private GeneralUtils generalUtils;
	
	/**
	 * 	Retorna todos los usuarios registrados
	 * @return List<UsuarioDto> usuarios
	 */
	public List<UsuarioDto> getUsers() {
		List<Usuario> usuarios =  usuarioRepository.findAll();
		
		List<UsuarioDto> usuariosDto =  generalUtils.convertUsuariosToUsuariosDto(usuarios);
		
		return usuariosDto;
	}
	
	/**
	 * Crea un nuevo usuario a partir de UsuarioDto	
	 * @param usuarioDto<UsuarioDto>
	 * @return nuevoUsario<Usuario>
	 */
	public UsuarioDto createUsuario( UsuarioDto usuarioDto) {
		Usuario usuario = generalUtils.convertUsuarioDtoToUsuario(usuarioDto);
		/** Verificar si la comuna existe 
		 * sino lanzar exception **/ 
		Usuario nuevoUsuario = usuarioRepository.save(usuario);
		
		return generalUtils.convertUserToUserDto(nuevoUsuario);
		
	}
	
	/**
	 * Actualizacion datos usuario 
	 * @param usuarioDto<UsuarioDto>
	 * @param usuarioId<Long>
	 * @return UsuarioDto
	 */
	public UsuarioDto updateUsuario(UsuarioUpdateDto usuarioUpdateDto, Long usuarioId) {
		UsuarioDto usuarioActualDto = getUsuarioById(usuarioId);
		Usuario usuarioActual = generalUtils.convertUsuarioDtoToUsuario(usuarioActualDto);
		/**
		 * verificar que la comuna exista
		 */
		usuarioActual.setApellido(usuarioUpdateDto.getApellido());
		usuarioActual.setCodComuna(usuarioUpdateDto.getCodComuna());
		usuarioActual.setNombre(usuarioUpdateDto.getNombre());
		usuarioActual.setTelefono(usuarioUpdateDto.getTelefono());
		
		return generalUtils.convertUserToUserDto(usuarioRepository.save(usuarioActual));
	}
	
	/**
	 * Obtiene un usuario en base a su Id
	 * @param usuarioId <Long>
	 * @return UsuarioDto 
	 */
	public UsuarioDto getUsuarioById( Long usuarioId ) {
		Usuario usuario = usuarioRepository.findById(usuarioId).orElseThrow(
				() -> new SodexoException(HttpStatus.NOT_FOUND, ErrorMessageEnum.USUARIO_ID_NOT_FOUND) );
		
		return generalUtils.convertUserToUserDto(usuario);
	}
	
	/**
	 * Borra usuario según su Id.
	 * @param usuarioId<Long>
	 */
	public void borrarUsuario(Long usuarioId) {
		Usuario usuario = generalUtils.convertUsuarioDtoToUsuario( this.getUsuarioById(usuarioId));
		/**
		 * lanzar exception si usuario no existe o es nulo
		 */
		usuarioRepository.delete(usuario);
	}
	
	
	
	
}
