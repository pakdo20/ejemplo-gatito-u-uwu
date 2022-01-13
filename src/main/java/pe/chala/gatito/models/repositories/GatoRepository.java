package pe.chala.gatito.models.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.chala.gatito.models.entities.Gato;

@Repository
public interface GatoRepository extends JpaRepository<Gato, Integer> {

}
