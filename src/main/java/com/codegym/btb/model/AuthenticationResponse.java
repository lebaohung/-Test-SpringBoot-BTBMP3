package com.codegym.btb.model;

import lombok.Data;

@Data
public class AuthenticationResponse {
    private final String access_token;

    public AuthenticationResponse(String access_token) {
        this.access_token = access_token;
    }
}
