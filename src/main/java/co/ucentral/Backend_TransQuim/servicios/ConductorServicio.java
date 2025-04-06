package co.ucentral.Backend_TransQuim.servicios;

import co.ucentral.Backend_TransQuim.dto.ConductorDto;
import co.ucentral.Backend_TransQuim.persistencia.entidades.Conductor;
import co.ucentral.Backend_TransQuim.persistencia.repositorios.ConductorRepositorio;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
@Service
@AllArgsConstructor
public class ConductorServicio {
    ConductorRepositorio conductorRepositorio;
    public List<Conductor> obtenerConductor(){
        return conductorRepositorio.findAll();
    }

    public ConductorDto crear (ConductorDto conductorDto){
        Conductor conductor =Conductor.builder()
                .cedula(conductorDto.cedula())
                .nombre(conductorDto.nombre())
                .apellido(conductorDto.apellido())
                .correo(conductorDto.correo())
                .fechaRegistro(LocalDateTime.now())
                .build();

        if (conductorRepositorio.save(conductor).getCedula()>0)
            return conductorDto;
            
        else return null;


    }

}
