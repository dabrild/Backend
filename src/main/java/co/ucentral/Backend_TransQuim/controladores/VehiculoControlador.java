package co.ucentral.Backend_TransQuim.controladores;

import co.ucentral.Backend_TransQuim.dto.VehiculoDto;
import co.ucentral.Backend_TransQuim.persistencia.entidades.Vehiculo;
import co.ucentral.Backend_TransQuim.servicios.VehiculoServicio;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@AllArgsConstructor
@RestController
@RequestMapping("/vehiculos")
@CrossOrigin(origins = "*")

public class VehiculoControlador {
    VehiculoServicio vehiculoServicio;


    @GetMapping("/")
    public List<Vehiculo> obtenerTodos() {
        return vehiculoServicio.obtenerVehiculo();
    }

    @PostMapping("/")
    public VehiculoDto crear (@RequestBody VehiculoDto vehiculo){
        return vehiculoServicio.crear(vehiculo);
    }
}


