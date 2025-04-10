package co.ucentral.Backend_TransQuim.dto;

import java.time.LocalDateTime;

public record ConductorDto(Long cedula, String nombre,String apellido, String correo,String clave, LocalDateTime fechaRegistro){
}
