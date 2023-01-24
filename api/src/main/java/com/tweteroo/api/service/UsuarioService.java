package com.tweteroo.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tweteroo.api.dto.UsuarioDTO;
import com.tweteroo.api.model.Usuario;
import com.tweteroo.api.repository.UsuarioRepository;

@Service
public class UsuarioService {
    
    @Autowired
    private UsuarioRepository repository;

    public Usuario save(UsuarioDTO dto) {
        return repository.save(new Usuario(dto));
    }

}
