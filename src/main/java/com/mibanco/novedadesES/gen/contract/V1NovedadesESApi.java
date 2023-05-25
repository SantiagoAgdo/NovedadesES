package com.mibanco.novedadesES.gen.contract;

import com.mibanco.novedadesES.gen.type.NovedadCDTDigitalType;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;



import java.io.InputStream;
import java.util.Map;
import java.util.List;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

@Path("/v1/es/novedadCDTDigital")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-05-25T15:28:41.354261700-05:00[America/Bogota]")
public interface V1NovedadesESApi {

    @POST
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    List<NovedadCDTDigitalType> crearNovedadClienteCDT(@Valid NovedadCDTDigitalType novedadCDTDigitalType);
}
