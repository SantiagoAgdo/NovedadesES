package com.mibanco.novedadesES.utils;

import com.mibanco.novedadesES.gen.type.NovedadCDTDigitalType;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.validation.Validator;
import jakarta.ws.rs.core.Response;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

@ApplicationScoped
public class NovedadesValidator {

    @Inject
    Validator validator;

    public Response verificarNovedadesCDT(NovedadCDTDigitalType novedadCDTDigitalType) throws NovedadesException {
        if (novedadCDTDigitalType.getNumeroDocumento() == null){
            throw new NovedadesException(ErrorCts.VALIDACION + " Numero de documento no puedo ser nulo");
        }

        if (novedadCDTDigitalType.getCodigoNovedad() == null){
            throw new NovedadesException(ErrorCts.VALIDACION + " Codigo no puedo ser nulo");
        }

//        if (novedadCDTDigitalType.getDescripcionNovedad() == null){
//            throw new NovedadesException(ErrorCts.VALIDACION + " Descripcion no puedo ser nulo");
//        }

        if (novedadCDTDigitalType.getFechaNovedad() == null) {
            throw new NovedadesException(ErrorCts.VALIDACION + " Fecha no puedo ser nulo");
        }

//        try{
//            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd", Locale.ENGLISH);
//            Date date = simpleDateFormat.parse(novedadCDTDigitalType.getFechaNovedad());
//        }catch (ParseException e){
//            throw new NovedadesException(ErrorCts.VALIDACION + " FOrmato de Fecha Invalido");
//        }

        return Response.ok().build();
    }



}
