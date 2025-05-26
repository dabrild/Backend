package co.ucentral.Backend_TransQuim.dto;

public record ChecklistVehiculoDto(
        long licencia,
        Boolean manualFugasDerrames,
        Boolean botiquinPrimerosAuxilios,
        Boolean elementosProteccionPersonal,
        Boolean documentacionVigenteMercanciasPeligrosas,
        Boolean certificacionManejoIncendios,
        Boolean manifiestosCarga,
        Boolean soat,
        Boolean tecnomecanica,
        Boolean seguro,
        String tipoQuimico,
        String cantidadQuimico,
        String tipoCarga,
        String tipoVehiculo
) {}
