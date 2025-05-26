package co.ucentral.Backend_TransQuim.persistencia.entidades;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class Conductor {

    @Id
    private Long cedula;
    private String nombre;
    private String apellido;

    @Column(unique = true)
    private String correo;
    private String clave;
    private LocalDateTime fechaRegistro;

    @OneToOne(mappedBy = "conductor")
    private Vehiculo vehiculo;

}
