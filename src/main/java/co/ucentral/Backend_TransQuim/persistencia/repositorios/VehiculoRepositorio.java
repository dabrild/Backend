package co.ucentral.Backend_TransQuim.persistencia.repositorios;

import co.ucentral.Backend_TransQuim.persistencia.entidades.Vehiculo;
import org.springframework.data.jpa.repository.JpaRepository;


public interface VehiculoRepositorio extends JpaRepository<Vehiculo, Long> {
}