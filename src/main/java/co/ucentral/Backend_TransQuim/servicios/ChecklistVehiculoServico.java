package co.ucentral.Backend_TransQuim.servicios;

import co.ucentral.Backend_TransQuim.dto.ChecklistVehiculoDto;
import co.ucentral.Backend_TransQuim.persistencia.entidades.ChecklistVehiculo;
import co.ucentral.Backend_TransQuim.persistencia.repositorios.ChecklistRepositorio;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class ChecklistVehiculoServico {

    private final ChecklistRepositorio checklistRepositorio;

    public List<ChecklistVehiculo> obtenerChecklistVehiculos() {
        return checklistRepositorio.findAll();
    }

    public ChecklistVehiculoDto crear(ChecklistVehiculoDto dto) {
        ChecklistVehiculo entidad = ChecklistVehiculo.builder()
                .licencia(dto.licencia())
                .manualFugasDerrames(dto.manualFugasDerrames())
                .botiquinPrimerosAuxilios(dto.botiquinPrimerosAuxilios())
                .elementosProteccionPersonal(dto.elementosProteccionPersonal())
                .documentacionVigenteMercanciasPeligrosas(dto.documentacionVigenteMercanciasPeligrosas())
                .certificacionManejoIncendios(dto.certificacionManejoIncendios())
                .manifiestosCarga(dto.manifiestosCarga())
                .soat(dto.soat())
                .tecnomecanica(dto.tecnomecanica())
                .seguro(dto.seguro())
                .tipoQuimico(dto.tipoQuimico())
                .cantidadQuimico(dto.cantidadQuimico())
                .tipoCarga(dto.tipoCarga())
                .tipoVehiculo(dto.tipoVehiculo())
                .build();

        checklistRepositorio.save(entidad);

        return dto;
    }
}
