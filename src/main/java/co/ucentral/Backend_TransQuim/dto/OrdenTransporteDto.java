package co.ucentral.Backend_TransQuim.dto;

import java.time.LocalDateTime;

public record OrdenTransporteDto(Long numeroOrden, LocalDateTime fechaAsignacion, String direccionRecogida, String direccionEntrega, String tipoSustancia, Long cantidad, String unidadMedida, String tipoVehiculo, LocalDateTime tiempoEstimadoEntrega, String estadoEntrega, String observaciones, String nombreCliente, Long telefonoContacto, String emailContacto, Long idConductor, Long idVehiculo) {
}
