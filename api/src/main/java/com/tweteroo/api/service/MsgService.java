package com.tweteroo.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.tweteroo.api.dto.MsgDTO;
import com.tweteroo.api.model.Msg;
import com.tweteroo.api.repository.MsgRepository;

@Service
public class MsgService {

    @Autowired
    private MsgRepository repository;

    public Msg save(MsgDTO dto) {
        return repository.save(new Msg(dto));
    }
    
    public Page<Msg> findAll(Pageable page) {
        return repository.findAll(page);
    }

    public List<Msg> findByUsername(String username) {
        return repository.findByUsername(username);
    }
}
