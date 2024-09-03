package com.classwork.classwork.service;

import com.classwork.classwork.request.RegisterUserRequest;
import com.classwork.classwork.request.RegisterUserResponse;

public interface ClientService {
    RegisterUserResponse registerUser(RegisterUserRequest registerUserRequest);
}
