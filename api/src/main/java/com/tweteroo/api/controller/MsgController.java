package com.tweteroo.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tweteroo.api.dto.MsgDTO;
import com.tweteroo.api.model.Msg;
import com.tweteroo.api.service.MsgService;

import jakarta.validation.Valid;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/tweets")
public class MsgController {
    
    @Autowired
    private MsgService service;

    @PostMapping
    public void create(@RequestBody @Valid MsgDTO req){
        service.save(req);
    }


    @GetMapping
    public Page<Msg> findAll(@PageableDefault(page = 0, size = 5) Pageable page) {
        return service.findAll(page);
    }

    @GetMapping("/{username}")
    public List<Msg> findByUsername(@PathVariable String username){
        return service.findByUsername(username);
    }
}
