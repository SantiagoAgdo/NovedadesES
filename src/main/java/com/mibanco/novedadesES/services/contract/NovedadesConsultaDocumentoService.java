package com.mibanco.novedadesES.services.contract;

import com.mibanco.novedadesES.gen.type.NovedadCDTDigitalType;

import java.util.List;

public interface NovedadesConsultaDocumentoService {
    List<NovedadCDTDigitalType> consultarNovedadesPorNumeroDocumento(String numero);
}
