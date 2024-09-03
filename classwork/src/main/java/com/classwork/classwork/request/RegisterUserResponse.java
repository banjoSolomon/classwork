package com.classwork.classwork.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegisterUserResponse {
    private String message;
    private Long userId;
    private String username;
}
