package co.ucentral.Backend_TransQuim.servicios;

import co.ucentral.Backend_TransQuim.dto.OrdenTransporteDto;
import co.ucentral.Backend_TransQuim.persistencia.entidades.OrdenTransporte;
import co.ucentral.Backend_TransQuim.persistencia.repositorios.OrdenTransporteRepositorio;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/OrdenTransporte")
@CrossOrigin(origins = "*")

public class OrdenTransporteServicio {

    OrdenTransporteRepositorio ordenTransporteRepositorio;
    public List<OrdenTransporte> obtenerOrdenTrasnporte(){
        return  ordenTransporteRepositorio.findAll();
    }

    public OrdenTransporteDto crear (OrdenTransporteDto ordenTransporteDto){
        OrdenTransporte ordenTransporte = OrdenTransporte.builder()
                .numeroOrden(ordenTransporteDto.numeroOrden())
                .fechaAsignacion(ordenTransporteDto.fechaAsignacion())
                .direccionRecogida(ordenTransporteDto.direccionRecogida())
                .direccionEntrega(ordenTransporteDto.direccionEntrega())
                .tipoSustancia(ordenTransporteDto.tipoSustancia())
                .cantidad(ordenTransporteDto.cantidad())
                .unidadMedida(ordenTransporteDto.unidadMedida())
                .tipoVehiculo(ordenTransporteDto.tipoVehiculo())
                .tiempoEstimadoEntrega(ordenTransporteDto.tiempoEstimadoEntrega())
                .estadoEntrega(ordenTransporteDto.estadoEntrega())
                .observaciones(ordenTransporteDto.observaciones())
                .nombreCliente(ordenTransporteDto.nombreCliente())
                .telefonoContacto(ordenTransporteDto.telefonoContacto())
                .emailContacto(ordenTransporteDto.emailContacto())
                .idConductor(ordenTransporteDto.idConductor())
                .idVehiculo(ordenTransporteDto.idVehiculo())
                .build();

        if (ordenTransporteRepositorio.save(ordenTransporte).getNumeroOrden()>0)
            return ordenTransporteDto;

        else return null;
    }

}
