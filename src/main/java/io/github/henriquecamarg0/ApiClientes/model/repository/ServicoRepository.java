package io.github.henriquecamarg0.ApiClientes.model.repository;

import io.github.henriquecamarg0.ApiClientes.model.entity.Servico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicoRepository extends JpaRepository<Servico, Integer> {
}
