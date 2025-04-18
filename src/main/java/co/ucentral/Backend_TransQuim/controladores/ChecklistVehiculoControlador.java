package co.ucentral.Backend_TransQuim.controladores;


import co.ucentral.Backend_TransQuim.dto.ChecklistVehiculoDto;
import co.ucentral.Backend_TransQuim.persistencia.entidades.ChecklistVehiculo;
import co.ucentral.Backend_TransQuim.servicios.ChecklistVehiculoServico;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/Checklist")
@CrossOrigin(origins = "*")


public class ChecklistVehiculoControlador {
    ChecklistVehiculoServico checklistVehiculoServico;


    @GetMapping("/")
    public List<ChecklistVehiculo> obtenerTodos() {
        return checklistVehiculoServico.obtenerChecklistVehiculos();
    }

    @PostMapping("/")
    public ChecklistVehiculoDto crear (@RequestBody ChecklistVehiculoDto checklistVehiculo){
        return checklistVehiculoServico.crear(checklistVehiculo);
    }
}
