package com.tweteroo.api.model;

import com.tweteroo.api.dto.MsgDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Msg {
    
    public Msg(MsgDTO data){
        this.username = data.username();
        this.tweet = data.tweet();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 255, nullable = false)
    private String username;

    @Column(length = 255, nullable = false)
    private String tweet;

}
