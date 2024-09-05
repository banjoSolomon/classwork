package com.classwork.classwork.service;

import com.classwork.classwork.dto.RegisterClientRequest;
import com.classwork.classwork.dto.RegisterClientResponse;

public interface ClientService {
    RegisterClientResponse registerClient(RegisterClientRequest registerClientRequest);

}
