package co.ucentral.Backend_TransQuim.servicios;

import co.ucentral.Backend_TransQuim.dto.ChecklistVehiculoDto;
import co.ucentral.Backend_TransQuim.persistencia.entidades.ChecklistVehiculo;
import co.ucentral.Backend_TransQuim.persistencia.repositorios.ChecklistRepositorio;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@AllArgsConstructor
@RestController
@RequestMapping("/Checklist")
@CrossOrigin(origins = "*")

public class ChecklistVehiculoServico {

    ChecklistRepositorio checklistRepositorio;
    public List<ChecklistVehiculo> obtenerChecklistVehiculos(){
        return checklistRepositorio.findAll();
    }

    public ChecklistVehiculoDto crear (ChecklistVehiculoDto checklistVehiculoDto){
        ChecklistVehiculo checklistVehiculo = ChecklistVehiculo.builder()
                .licencia(checklistVehiculoDto.licencia())
                .manualFugasDerrames(checklistVehiculoDto.manualFugasDerrames())
                .botiquinPrimerosAuxilios(checklistVehiculoDto.botiquinPrimerosAuxilios())
                .elementosProteccionPersonal(checklistVehiculoDto.elementosProteccionPersonal())
                .documentacionVigenteMercanciasPeligrosas(checklistVehiculoDto.documentacionVigenteMercanciasPeligrosas())
                .certificacionManejoIncendios(checklistVehiculoDto.certificacionManejoIncendios())
                .tipoQuimico(checklistVehiculoDto.tipoQuimico())
                .cantidadQuimico(checklistVehiculoDto.cantidadQuimico())
                .manifiestosCarga(checklistVehiculoDto.manifiestosCarga())
                .soat(checklistVehiculoDto.soat())
                .tecnomecanica(checklistVehiculoDto.tecnomecanica())
                .seguro(checklistVehiculoDto.seguro())
                .tipoCarga(checklistVehiculoDto.tipoCarga())
                .tipoVehiculo(checklistVehiculoDto.tipoVehiculo())
                .build();

        if (checklistRepositorio.save(checklistVehiculo).getLicencia()>0)
            return checklistVehiculoDto;
        else return null;
    }
}