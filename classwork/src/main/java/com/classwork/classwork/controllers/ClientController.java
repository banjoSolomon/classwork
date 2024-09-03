package com.classwork.classwork.controllers;

import com.classwork.classwork.request.RegisterUserRequest;
import com.classwork.classwork.request.RegisterUserResponse;
import com.classwork.classwork.service.ClientService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1/clients")
public class ClientController {
    private final ClientService clientservice;
    @PostMapping("/registerBooking")
    public ResponseEntity<?> register(@RequestBody RegisterUserRequest registerUserRequest){
        try {
            RegisterUserResponse response = clientservice.registerUser(registerUserRequest);
            return new ResponseEntity<>(response, HttpStatus.OK);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }

    }


}
