package co.ucentral.Backend_TransQuim.persistencia.entidades;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "checklist_vehiculo")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class ChecklistVehiculo {

    @Id
    private Long licencia;

    // Cambiar de String a Boolean para que coincida con el frontend
    private Boolean manualFugasDerrames;
    private Boolean botiquinPrimerosAuxilios;
    private Boolean elementosProteccionPersonal;
    private Boolean documentacionVigenteMercanciasPeligrosas;
    private Boolean certificacionManejoIncendios;
    private Boolean manifiestosCarga;
    private Boolean soat;
    private Boolean tecnomecanica;
    private Boolean seguro;

    // Campos informativos (mantener como String)
    private String tipoQuimico;
    private String cantidadQuimico; // Cambiar de Long a String para mayor flexibilidad
    private String tipoCarga;
    private String tipoVehiculo;

    // Agregar campos de auditoría (opcionales pero recomendados)
    private LocalDateTime fechaCreacion;
    private LocalDateTime fechaActualizacion;

    // Método para establecer fecha de creación automáticamente
    @PrePersist
    protected void onCreate() {
        fechaCreacion = LocalDateTime.now();
    }

    // Método para actualizar fecha de modificación automáticamente
    @PreUpdate
    protected void onUpdate() {
        fechaActualizacion = LocalDateTime.now();
    }
}