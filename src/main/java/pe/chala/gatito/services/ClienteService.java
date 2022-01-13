package pe.chala.gatito.services;

import java.util.List;

import pe.chala.gatito.models.entities.Cliente;


public interface ClienteService extends CrudService<Cliente, Integer> { 
	List<Cliente>findByNombreApellidos(String nombreApellidos) throws Exception;
}
