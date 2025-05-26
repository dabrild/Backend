package co.ucentral.Backend_TransQuim.controladores;

import co.ucentral.Backend_TransQuim.dto.ChecklistVehiculoDto;
import co.ucentral.Backend_TransQuim.persistencia.entidades.ChecklistVehiculo;
import co.ucentral.Backend_TransQuim.servicios.ChecklistVehiculoServico;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/checklist")
@CrossOrigin(origins = "*")
public class ChecklistVehiculoControlador {

    private final ChecklistVehiculoServico checklistVehiculoServico;

    // Obtener todos los checklist
    @GetMapping("/listar")
    public List<ChecklistVehiculo> obtenerTodos() {
        return checklistVehiculoServico.obtenerChecklistVehiculos();
    }

    // Crear un nuevo checklist
    @PostMapping("/crear")
    public ChecklistVehiculoDto crear(@RequestBody ChecklistVehiculoDto checklistVehiculoDto) {
        return checklistVehiculoServico.crear(checklistVehiculoDto);
    }
}

