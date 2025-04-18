package co.ucentral.Backend_TransQuim.persistencia.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder

public class ChecklistVehiculo {

    @Id
    private Long licencia;
    private String manualFugasDerrames;
    private String botiquinPrimerosAuxilios;
    private String elementosProteccionPersonal;
    private String documentacionVigenteMercanciasPeligrosas;
    private String certificacionManejoIncendios;
    private String tipoQuimico; // Si aplica
    private Long cantidadQuimico; // Si aplica
    private String manifiestosCarga;
    private Long soat;
    private Long tecnomecanica;
    private Long seguro;
    private String tipoCarga;
    private String tipoVehiculo;
}
