package io.github.henriquecamarg0.ApiClientes;

import io.github.henriquecamarg0.ApiClientes.model.entity.Cliente;
import io.github.henriquecamarg0.ApiClientes.model.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ClientesApplication {
public static void main(String[] args) {
		SpringApplication.run(ClientesApplication.class, args);
	}

}
