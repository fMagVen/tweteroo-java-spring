package com.tweteroo.api.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;

public record MsgDTO(
    
    @NotBlank @NotEmpty
    String username, 


    String avatar, 

    @NotBlank @NotEmpty
    String tweet) {
    
}
