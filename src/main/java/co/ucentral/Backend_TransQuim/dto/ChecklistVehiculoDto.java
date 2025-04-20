package co.ucentral.Backend_TransQuim.dto;

import java.time.LocalDateTime;

public record ChecklistVehiculoDto (long licencia, String manualFugasDerrames, String botiquinPrimerosAuxilios, String elementosProteccionPersonal, String documentacionVigenteMercanciasPeligrosas, String certificacionManejoIncendios, String tipoQuimico, long cantidadQuimico, String manifiestosCarga, long soat, long tecnomecanica, long seguro, String tipoCarga, String tipoVehiculo){ }
