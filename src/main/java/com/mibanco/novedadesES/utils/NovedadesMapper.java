package com.mibanco.novedadesES.utils;

import com.mibanco.novedadesES.dao.entity.NovedadesEntity;
import com.mibanco.novedadesES.gen.type.NovedadCDTDigitalType;
import jakarta.enterprise.context.ApplicationScoped;
import org.modelmapper.ModelMapper;

@ApplicationScoped
public class NovedadesMapper {

    public NovedadCDTDigitalType novedadCDTDigitalToType(NovedadesEntity novedadesEntity){
        return new ModelMapper().map(novedadesEntity, NovedadCDTDigitalType.class);
    }

    public NovedadesEntity novedadTypeToEntity(NovedadCDTDigitalType novedadCDTDigitalType){
        return new ModelMapper().map(novedadCDTDigitalType, NovedadesEntity.class);
    }

}
