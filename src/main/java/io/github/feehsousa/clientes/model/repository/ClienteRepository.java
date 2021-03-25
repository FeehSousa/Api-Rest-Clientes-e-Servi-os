package io.github.feehsousa.clientes.model.repository;

import io.github.feehsousa.clientes.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente,Integer> {
}
