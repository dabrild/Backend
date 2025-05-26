package co.ucentral.Backend_TransQuim.persistencia.entidades;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder

public class Vehiculo {

    @Id
    private Long licenciaTransito;
    private String placa;
    private String marca;
    private String estado; // Disponible / En mantenimiento / Asignado""
    private String color;
    private String tipoCarga;

    @OneToOne
    @JoinColumn(name = "cedula_conductor", unique = true) // Unique para evitar duplicados
    @JsonIgnore
    private Conductor conductor;

}
