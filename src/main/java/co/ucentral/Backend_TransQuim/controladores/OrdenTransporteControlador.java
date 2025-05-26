
package co.ucentral.Backend_TransQuim.controladores;

import co.ucentral.Backend_TransQuim.dto.OrdenTransporteDto;
import co.ucentral.Backend_TransQuim.persistencia.entidades.OrdenTransporte;
import co.ucentral.Backend_TransQuim.servicios.OrdenTransporteServicio;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/OrdenTransporte")
@CrossOrigin(origins = "*")

public class OrdenTransporteControlador {
    OrdenTransporteServicio ordenTransporteServicio;

    @GetMapping("/obtener")
    public List<OrdenTransporte> obtenerTodos(){
        return  ordenTransporteServicio.obtenerOrdenTrasnporte();
    }

    @PostMapping("/crear")
    public OrdenTransporteDto crear(@RequestBody OrdenTransporteDto ordenTransporte){ return  ordenTransporteServicio.crear(ordenTransporte);}


}
