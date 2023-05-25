package com.mibanco.novedadesES.utils;

import com.mibanco.novedadClienteCDT.NovedadCDTDigitalGrpc;
import com.mibanco.novedadesES.dao.entity.NovedadesEntity;
import com.mibanco.novedadesES.gen.type.NovedadCDTDigitalType;
import jakarta.enterprise.context.ApplicationScoped;
import org.modelmapper.ModelMapper;

@ApplicationScoped
public class NovedadesCDTDigitalMapperGrpc {

    public NovedadesEntity novedadGrpcToEntity(NovedadCDTDigitalGrpc novedadCDTDigitalGrpc){
        var retorno = new ModelMapper().map(novedadCDTDigitalGrpc, NovedadesEntity.class);
        System.out.println(" ================   respuesta del modelMapper" + retorno + " =============");
        return retorno;
    }

    public NovedadCDTDigitalGrpc novedadGrpcToGrpc(NovedadCDTDigitalType novedadCDTDigitalType){
        return new ModelMapper().map(novedadCDTDigitalType, NovedadCDTDigitalGrpc.class);
    }

}
