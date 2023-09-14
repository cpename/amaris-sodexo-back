package com.cpena.amaris.sodexo.back.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cpena.amaris.sodexo.back.domain.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
