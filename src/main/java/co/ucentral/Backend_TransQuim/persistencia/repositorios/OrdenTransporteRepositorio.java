package co.ucentral.Backend_TransQuim.persistencia.repositorios;

import co.ucentral.Backend_TransQuim.persistencia.entidades.ChecklistVehiculo;
import co.ucentral.Backend_TransQuim.persistencia.entidades.OrdenTransporte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdenTransporteRepositorio extends JpaRepository<OrdenTransporte, Long>  {
}



