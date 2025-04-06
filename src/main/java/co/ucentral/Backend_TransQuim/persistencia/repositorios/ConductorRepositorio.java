package co.ucentral.Backend_TransQuim.persistencia.repositorios;

import co.ucentral.Backend_TransQuim.persistencia.entidades.Conductor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConductorRepositorio extends JpaRepository<Conductor, Long> {

}
