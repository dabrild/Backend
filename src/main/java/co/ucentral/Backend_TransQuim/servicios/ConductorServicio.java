package co.ucentral.Backend_TransQuim.servicios;

import co.ucentral.Backend_TransQuim.persistencia.entidades.Conductor;
import co.ucentral.Backend_TransQuim.persistencia.repositorios.ConductorRepositorio;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class ConductorServicio {
    ConductorRepositorio conductorRepositorio;
    public List<Conductor> obtenerConductor(){
        return conductorRepositorio.findAll();
    }
}
