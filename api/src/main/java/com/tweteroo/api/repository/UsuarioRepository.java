package com.tweteroo.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tweteroo.api.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    
}
