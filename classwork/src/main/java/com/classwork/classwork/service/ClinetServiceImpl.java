package com.classwork.classwork.service;

import com.classwork.classwork.repository.ClientRepository;
import com.classwork.classwork.request.RegisterUserRequest;
import com.classwork.classwork.request.RegisterUserResponse;
import model.Client;
import org.springframework.stereotype.Service;

@Service
public class ClinetServiceImpl implements ClientService{
   private final ClientRepository clientRepository;

    public ClinetServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public RegisterUserResponse registerUser(RegisterUserRequest registerUserRequest) {
        Client user = new Client();
        user.setUsername(registerUserRequest.getUsername());
        user.setPassword(registerUserRequest.getPassword());
        clientRepository.save(user);
        RegisterUserResponse response = new RegisterUserResponse();
        response.setUserId(user.getId());
        response.setUsername(user.getUsername());
        response.setMessage("User successfully registered");
        return response;
    }
}
