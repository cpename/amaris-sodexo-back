package com.cpena.amaris.sodexo.back.domain.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity(name = "Usuario")
@Table( name = "usuario" )
@Getter
@Setter
@RequiredArgsConstructor
public class Usuario {
		
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "usuario_id_seq")
	@Column(name = "usuario_id")
	private Long id;

	@Column(name = "nombre", nullable = false)
	private String nombre;
	@Column(name = "apellido", nullable = false)
	private String apellido;
	@Column(name = "telefono", nullable = true)
	private String telefono;
	@Column(name = "cod_comuna")
	private String codComuna;
	  
//	  fecha_create TIMESTAMP 
//	  fecha_update  TIMESTAMP

  
	
}
