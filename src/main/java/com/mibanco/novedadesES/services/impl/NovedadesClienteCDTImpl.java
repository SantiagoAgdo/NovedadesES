package com.mibanco.novedadesES.services.impl;

import com.mibanco.novedadesES.controller.NovedadesController;
import com.mibanco.novedadesES.dao.contract.NovedadClienteCDTDao;
import com.mibanco.novedadesES.dao.entity.NovedadesEntity;
import com.mibanco.novedadesES.gen.type.NovedadCDTDigitalType;
import com.mibanco.novedadesES.services.contract.NovedadesClienteCDTService;
import com.mibanco.novedadesES.utils.ErrorCts;
import com.mibanco.novedadesES.utils.NovedadesException;
import com.mibanco.novedadesES.utils.NovedadesMapper;
import com.mibanco.novedadesES.utils.NovedadesValidator;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

@ApplicationScoped
public class NovedadesClienteCDTImpl implements NovedadesClienteCDTService {

    public static final Logger logger = LoggerFactory.getLogger(NovedadesController.class);

    @Inject
    NovedadClienteCDTDao novedadClienteCDTDao;

    @Inject
    NovedadesMapper novedadesMapper;

    @Inject
    NovedadesValidator novedadesValidator;

    @Override
    @Transactional
    public NovedadCDTDigitalType crearNovedadCdtDigitalType(NovedadesEntity novedadesEntity) {

        logger.info("Inicia creacion de crearNovedadCdtDigitalTypeImpl");

        try {
            NovedadCDTDigitalType novedadCDTDigitalType = novedadesMapper.novedadCDTDigitalToType(novedadesEntity);
            novedadesValidator.verificarNovedadesCDT(novedadCDTDigitalType);

            novedadClienteCDTDao.persist(novedadesEntity);

            logger.info("Termina creacion de crearNovedadCdtDigitalTypeImpl");
            return  novedadCDTDigitalType;
        }catch (NovedadesException e){
            logger.error(ErrorCts.OUTPUT_CLIENTES + " en NovedadesClienteCDTImpl exception: " + e.getMessage());
            throw new NovedadesException(ErrorCts.SERVICIO + e.getMessage() + "  en NovedadesClienteCDTImpl ");
        }
    }

    @Override
    public List<NovedadCDTDigitalType> getNovedad() {
        return null;
    }
}
