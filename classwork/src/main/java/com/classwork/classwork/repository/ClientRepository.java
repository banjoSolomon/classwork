package com.classwork.classwork.repository;

import com.classwork.classwork.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
