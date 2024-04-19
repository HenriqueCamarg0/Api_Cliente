package io.github.henriquecamarg0.ApiClientes.model.repository;

import io.github.henriquecamarg0.ApiClientes.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
