package com.example.trucobackend.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BackResponse {
    String status;
    String message;
    public BackResponse(String status, String message) {
        this.status = status;
        this.message = message;
    }
}
