package com.mibanco.novedadesES.services.impl;

import com.mibanco.novedadesES.controller.NovedadesController;
import com.mibanco.novedadesES.dao.contract.NovedadConsultaDocumentoDao;
import com.mibanco.novedadesES.dao.entity.NovedadesEntity;
import com.mibanco.novedadesES.gen.type.NovedadCDTDigitalType;
import com.mibanco.novedadesES.services.contract.NovedadesConsultaDocumentoService;
import com.mibanco.novedadesES.utils.ErrorCts;
import com.mibanco.novedadesES.utils.NovedadesException;
import com.mibanco.novedadesES.utils.NovedadesMapper;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
public class NovedadesConsultaDocumentoImpl implements NovedadesConsultaDocumentoService {

    public static final Logger logger = LoggerFactory.getLogger(NovedadesController.class);

    @Inject
    NovedadConsultaDocumentoDao novedadConsultaDocumentoDao;

    @Inject
    NovedadesMapper novedadesMapper;

    @Override
    public List<NovedadCDTDigitalType> consultarNovedadesPorNumeroDocumento(String numero) {
        logger.info("Inicia consulta de NovedadesPorNumeroDocumento");

        try {
            List<NovedadesEntity> list = novedadConsultaDocumentoDao.list("numeroDocumento", numero);

            logger.info("Termina consulta de NovedadesPorNumeroDocumento");
            return  list.stream().map(novedadesMapper::novedadCDTDigitalToType)
                    .collect(Collectors.toList());
        }catch (NovedadesException e){
            logger.error(ErrorCts.OUTPUT_CLIENTES + " en NovedadesConsultaDocumentoImpl exception: " + e.getMessage());
            throw new NovedadesException(ErrorCts.SERVICIO + e.getMessage() + "  en NovedadesConsultaDocumentoImpl ");
        }
    }
}
