package co.ucentral.Backend_TransQuim.servicios;

import co.ucentral.Backend_TransQuim.dto.ConductorDto;
import co.ucentral.Backend_TransQuim.persistencia.entidades.Conductor;
import co.ucentral.Backend_TransQuim.persistencia.repositorios.ConductorRepositorio;
import lombok.AllArgsConstructor;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
@AllArgsConstructor
@Slf4j
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
                .clave(conductorDto.clave())
                .fechaRegistro(LocalDateTime.now())
                .build();

        if (conductorRepositorio.save(conductor).getCedula()>0)
            return conductorDto;

        else return null;


    }

    public ConductorDto autenticar(ConductorDto conductorDto) {
        Optional<Conductor> optional = this.conductorRepositorio.findByCorreo(conductorDto.correo());
        log.info("Verificando ");


        if (optional.isPresent()) {
            Conductor conductor = optional.get();
            if (Objects.equals(conductor.getClave(), conductorDto.clave())) {
                return new ConductorDto(
                        conductor.getCedula(),
                        conductor.getNombre(),
                        conductor.getApellido(),
                        conductor.getCorreo(),
                        "",
                        conductor.getFechaRegistro());
            }

        }return null;

    }


}