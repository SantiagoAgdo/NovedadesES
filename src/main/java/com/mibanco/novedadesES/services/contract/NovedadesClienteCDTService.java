package com.mibanco.novedadesES.services.contract;

import com.mibanco.novedadesES.dao.entity.NovedadesEntity;
import com.mibanco.novedadesES.gen.type.NovedadCDTDigitalType;

public interface NovedadesClienteCDTService {

    NovedadCDTDigitalType crearNovedadCdtDigitalType(NovedadesEntity novedadesEntity);

}
