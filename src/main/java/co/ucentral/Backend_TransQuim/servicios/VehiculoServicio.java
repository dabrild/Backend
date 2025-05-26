package co.ucentral.Backend_TransQuim.servicios;

import co.ucentral.Backend_TransQuim.dto.AsignacionVehiculoDto;
import co.ucentral.Backend_TransQuim.dto.VehiculoDto;
import co.ucentral.Backend_TransQuim.persistencia.entidades.Conductor;
import co.ucentral.Backend_TransQuim.persistencia.entidades.Vehiculo;
import co.ucentral.Backend_TransQuim.persistencia.repositorios.ConductorRepositorio;
import co.ucentral.Backend_TransQuim.persistencia.repositorios.VehiculoRepositorio;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@RestController
@RequestMapping("/vehiculos")
@CrossOrigin(origins = "*")

public class VehiculoServicio {
    private final VehiculoRepositorio vehiculoRepositorio;
    private final ConductorRepositorio conductorRepositorio;


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

    public VehiculoDto asignarVehiculo(AsignacionVehiculoDto dto) {
        Optional<Vehiculo> optionalVehiculo = vehiculoRepositorio.findById(dto.licenciaTransito());
        Optional<Conductor> optionalConductor = conductorRepositorio.findById(dto.cedulaConductor());

        if (optionalVehiculo.isEmpty())
            throw new RuntimeException("Vehículo no encontrado");

        if (optionalConductor.isEmpty())
            throw new RuntimeException("Conductor no encontrado");

        Vehiculo vehiculo = optionalVehiculo.get();
        Conductor conductor = optionalConductor.get();

        // Validar que el vehículo no esté ya asignado
        if (vehiculo.getConductor() != null)
            throw new RuntimeException("Vehículo ya está asignado a otro conductor");

        // Validar que el conductor no tenga ya un vehículo asignado
        if (conductor.getVehiculo() != null)
            throw new RuntimeException("Conductor ya tiene un vehículo asignado");

        // Asignar
        vehiculo.setConductor(conductor);
        conductor.setVehiculo(vehiculo);

        // Guardar cambios (importante guardar ambas entidades)
        vehiculoRepositorio.save(vehiculo);
        conductorRepositorio.save(conductor);

        // Retornar DTO actualizado (podrías crear un método para mapear, aquí solo devuelvo dto recibido)
        return new VehiculoDto(
                vehiculo.getLicenciaTransito(),
                vehiculo.getPlaca(),
                vehiculo.getMarca(),
                vehiculo.getEstado(),
                vehiculo.getColor(),
                vehiculo.getTipoCarga()
        );
    }
}


