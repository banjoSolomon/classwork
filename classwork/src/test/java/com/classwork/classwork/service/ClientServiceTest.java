package com.classwork.classwork.service;

import com.classwork.classwork.dto.RegisterClientRequest;
import com.classwork.classwork.dto.RegisterClientResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class ClientServiceTest {
    @Autowired
    private ClientService clientService;

    @Test
    public void testRegister(){
        RegisterClientRequest registerClientRequest = new RegisterClientRequest();
        registerClientRequest.setUsername("username");
        registerClientRequest.setPassword("password");
        RegisterClientResponse response = clientService.registerClient(registerClientRequest);
        assertNotNull(response);
        assertEquals("username", response.getUsername());
        assertNotNull(response.getClientId());
        assertEquals("User successfully registered", response.getMessage());
    }
}
