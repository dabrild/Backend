package co.ucentral.Backend_TransQuim.persistencia.repositorios;

import co.ucentral.Backend_TransQuim.persistencia.entidades.ChecklistVehiculo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChecklistRepositorio extends JpaRepository<ChecklistVehiculo, Long> {
}
