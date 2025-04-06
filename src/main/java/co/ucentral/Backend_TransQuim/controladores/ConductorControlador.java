package co.ucentral.Backend_TransQuim.controladores;

import co.ucentral.Backend_TransQuim.dto.ConductorDto;
import co.ucentral.Backend_TransQuim.persistencia.entidades.Conductor;
import co.ucentral.Backend_TransQuim.servicios.ConductorServicio;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/conductores")
@CrossOrigin(origins = "*")
public class ConductorControlador {
    ConductorServicio conductorServicio;

    @GetMapping("/")
    public List<Conductor>obtenerTodos(){
        return conductorServicio.obtenerConductor();
    }

    @PostMapping("/")
    public ConductorDto crear (@RequestBody ConductorDto conductor){
        return conductorServicio.crear(conductor);
    }



}
