package co.ucentral.Backend_TransQuim.persistencia.repositorios;

import co.ucentral.Backend_TransQuim.persistencia.entidades.Conductor;
import co.ucentral.Backend_TransQuim.persistencia.entidades.Vehiculo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface VehiculoRepositorio extends JpaRepository<Vehiculo, Long> {
    List<Vehiculo> findByConductor(Conductor conductor);
}