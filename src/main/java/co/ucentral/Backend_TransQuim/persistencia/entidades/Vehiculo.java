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

public class Vehiculo {

    @Id
    private Long licenciaTransito;
    private String placa;
    private String marca;
    private String estado; // Disponible / En mantenimiento""
    private String color;
    private String tipoCarga;

}

