package com.mibanco.novedadesES.controller;

import com.mibanco.novedadesES.dao.entity.NovedadesEntity;
import com.mibanco.novedadesES.gen.contract.V1NovedadesESApi;
import com.mibanco.novedadesES.gen.type.NovedadCDTDigitalType;
import com.mibanco.novedadesES.services.impl.NovedadesClienteCDTImpl;
import com.mibanco.novedadesES.utils.ErrorCts;
import com.mibanco.novedadesES.utils.NovedadesException;
import com.mibanco.novedadesES.utils.NovedadesMapper;
import jakarta.inject.Inject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class NovedadesController implements V1NovedadesESApi {

    public static final Logger logger = LoggerFactory.getLogger(NovedadesController.class);

    @Inject
    NovedadesClienteCDTImpl novedadesClienteCDT;

    @Inject
    NovedadesMapper novedadesMapper;

    @Override
    public List<NovedadCDTDigitalType> crearNovedadClienteCDT(NovedadCDTDigitalType novedadCDTDigitalType) {
        logger.info("Inicia crearNovedadClienteCDTController");

        try{
            NovedadesEntity novedadesEntity = novedadesMapper.novedadTypeToEntity(novedadCDTDigitalType);
            novedadCDTDigitalType = novedadesClienteCDT.crearNovedadCdtDigitalType(novedadesEntity);

            logger.info("Finaliza crearNovedadClienteCDTController");
            return List.of(novedadCDTDigitalType);
        }catch (NovedadesException novedadesException){
            logger.error(ErrorCts.SERVICIO + " crearNovedadClienteCDTController exception: " + novedadesException.getMessage());
            throw  new NovedadesException(ErrorCts.SERVICIO + novedadesException.getMessage() + " En crearNovedadClienteCDTController");
        }

    }
}
