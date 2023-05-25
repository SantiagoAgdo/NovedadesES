package com.mibanco.novedadesES.utils;

import com.mibanco.novedadesES.controller.NovedadesController;
import com.mibanco.novedadesES.gen.type.NovedadCDTDigitalType;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.core.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@ApplicationScoped
public class NovedadesValidator {

    public static final Logger logger = LoggerFactory.getLogger(NovedadesController.class);

    public Response verificarNovedadesCDT(NovedadCDTDigitalType novedadCDTDigitalType) throws NovedadesException {
        if (novedadCDTDigitalType.getNumeroDocumento() == null) {
            throw new NovedadesException(ErrorCts.VALIDACION + " Numero de documento no puedo ser nulo");
        }

        if (novedadCDTDigitalType.getCodigoNovedad() == null) {
            throw new NovedadesException(ErrorCts.VALIDACION + " Codigo no puedo ser nulo");
        }

        if (novedadCDTDigitalType.getFechaNovedad() == null) {
            throw new NovedadesException(ErrorCts.VALIDACION + " Fecha no puedo ser nulo");
        }

        logger.info("Validacion realizadas correctamente");

        return Response.ok().build();
    }


}
