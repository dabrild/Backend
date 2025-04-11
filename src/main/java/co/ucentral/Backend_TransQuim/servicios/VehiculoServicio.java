package co.ucentral.Backend_TransQuim.servicios;

import co.ucentral.Backend_TransQuim.dto.VehiculoDto;
import co.ucentral.Backend_TransQuim.persistencia.entidades.Vehiculo;
import co.ucentral.Backend_TransQuim.persistencia.repositorios.VehiculoRepositorio;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/vehiculos")
@CrossOrigin(origins = "*")

public class VehiculoServicio {

    VehiculoRepositorio vehiculoRepositorio;
    public List<Vehiculo> obtenerVehiculo(){
        return vehiculoRepositorio.findAll();
    }

    public VehiculoDto crear (VehiculoDto vehiculoDto){
        Vehiculo vehiculo =Vehiculo.builder()
                .licenciaTransito(vehiculoDto.licenciaTransito())
                .placa(vehiculoDto.placa())
                .marca(vehiculoDto.marca())
                .estado(vehiculoDto.estado())
                .color(vehiculoDto.color())
                .tipoCarga(vehiculoDto.tipoCarga())
                .build();

        if (vehiculoRepositorio.save(vehiculo).getLicenciaTransito()>0)
            return vehiculoDto;

        else return null;
    }
}


