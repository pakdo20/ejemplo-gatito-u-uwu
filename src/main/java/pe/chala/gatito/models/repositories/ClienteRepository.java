package pe.chala.gatito.models.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.chala.gatito.models.entities.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
	List<Cliente>findByNombreApellidosContaining(String nombreApellidos) throws Exception;
}
