package co.ucentral.Backend_TransQuim.persistencia.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder

public class OrdenTransporte {

    @Id
    private Long numeroOrden;
    private LocalDateTime fechaAsignacion;
    private String direccionRecogida;
    private String direccionEntrega;
    private String tipoSustancia;
    private Long cantidad;
    private String unidadMedida; // "L", "kg", etc.
    private String tipoVehiculo;
    private LocalDateTime tiempoEstimadoEntrega;
    private String estadoEntrega; // Asignada, En camino, Entregada, Cancelada
    private String observaciones;
    private String nombreCliente;
    private Long telefonoContacto;
    private String emailContacto;
    private Long idConductor;
    private Long idVehiculo;
}
