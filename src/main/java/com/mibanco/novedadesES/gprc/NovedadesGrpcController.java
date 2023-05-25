package com.mibanco.novedadesES.gprc;

import com.mibanco.novedadClienteCDT.Creado;
import com.mibanco.novedadClienteCDT.NovedadCDTDigitalGrpc;
import com.mibanco.novedadClienteCDT.NovedadClienteCDTServiceGrpcGrpc.NovedadClienteCDTServiceGrpcImplBase;
import com.mibanco.novedadesES.controller.NovedadesController;
import com.mibanco.novedadesES.dao.entity.NovedadesEntity;
import com.mibanco.novedadesES.gen.type.NovedadCDTDigitalType;
import com.mibanco.novedadesES.services.impl.NovedadesClienteCDTImpl;
import com.mibanco.novedadesES.utils.ErrorCts;
import com.mibanco.novedadesES.utils.NovedadesCDTDigitalMapperGrpc;
import com.mibanco.novedadesES.utils.NovedadesException;
import io.grpc.stub.StreamObserver;
import io.quarkus.grpc.GrpcService;
import io.smallrye.common.annotation.Blocking;
import jakarta.inject.Inject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@GrpcService
public class NovedadesGrpcController  extends NovedadClienteCDTServiceGrpcImplBase {

    public static final Logger logger = LoggerFactory.getLogger(NovedadesController.class);

    @Inject
    NovedadesClienteCDTImpl novedadesClienteCDT;

    @Inject
    NovedadesCDTDigitalMapperGrpc novedadesCDTDigitalMapperGrpc;


    @Override
    @Blocking
    public void crearNovedadCDT(NovedadCDTDigitalGrpc request, StreamObserver<Creado> responseObs){

        logger.info("Inicia Creacion Novedad por GRPC");

        NovedadesEntity novedadesEntity = novedadesCDTDigitalMapperGrpc.novedadGrpcToEntity(request);

        try{
            NovedadCDTDigitalType novedadCDTDigitalType = novedadesClienteCDT.crearNovedadCdtDigitalType(novedadesEntity);
            Creado crearNovedadEntidad = Creado.newBuilder().setNovedadCDTDigital(novedadesCDTDigitalMapperGrpc.novedadGrpcToGrpc(novedadCDTDigitalType)).build();

            responseObs.onNext(crearNovedadEntidad);

            logger.info("Finaliza creacion novedad con GRPC");
            responseObs.onCompleted();
        }catch (NovedadesException e){
            logger.error(ErrorCts.SERVICIO + " Creacion Novedad Grpc");
            throw  new NovedadesException(ErrorCts.SERVICIO + e.getMessage() + " Creacion Novedad Grpc");
        }
    }
}
