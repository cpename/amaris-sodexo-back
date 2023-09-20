package com.cpena.amaris.sodexo.back.service.dtos;



import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UsuarioDto {
	private Long id;
	private String nombre;
	private String apellido;
	private String telefono;
	private String codComuna;
}
