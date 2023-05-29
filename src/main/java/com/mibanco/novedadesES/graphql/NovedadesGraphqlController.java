package com.mibanco.novedadesES.graphql;

import com.mibanco.novedadesES.controller.NovedadesController;
import com.mibanco.novedadesES.dao.entity.NovedadesEntity;
import com.mibanco.novedadesES.gen.type.NovedadCDTDigitalType;
import com.mibanco.novedadesES.services.impl.NovedadesClienteCDTImpl;
import com.mibanco.novedadesES.utils.ErrorCts;
import com.mibanco.novedadesES.utils.NovedadesException;
import com.mibanco.novedadesES.utils.NovedadesMapper;
import jakarta.inject.Inject;
import jakarta.validation.Valid;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Mutation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@GraphQLApi
public class NovedadesGraphqlController {

//    public static final Logger logger = LoggerFactory.getLogger(NovedadesController.class);
//
//    @Inject
//    NovedadesClienteCDTImpl novedadesClienteCDT;
//
//    @Inject
//    NovedadesMapper novedadesMapper;
//
//
//    @Description("Crear novedad de cliente en CDT mediante server")
//    public NovedadCDTDigitalType crearNovedadCLienteCDT(@Valid NovedadCDTDigitalType novedadCDTDigitalType){
//
//        logger.info("Inicia creacion de novedades para cliente CDT con graphql");
//
//        try{
//            NovedadesEntity novedadesEntity = novedadesMapper.novedadTypeToEntity(novedadCDTDigitalType);
//            logger.info("Terminacion creacion de novedades para cliente CDT con graphq");
//            return novedadesClienteCDT.crearNovedadCdtDigitalType(novedadesEntity);
//        }catch (NovedadesException e){
//            logger.error("Error al realizar creacion de novedad mediante Graphql");
//            throw  new NovedadesException(ErrorCts.SERVICIO + " en Graphql");
//        }
//
//    }
}
