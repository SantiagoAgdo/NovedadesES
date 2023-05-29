package com.mibanco.novedadesES.gen.type;

import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("crearNovedadClienteCDTInput")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-05-26T10:47:56.282911-05:00[America/Bogota]")
public class CrearNovedadClienteCDTInput   {
  private @Valid String numeroDocumento;
  private @Valid String codigoNovedad;
  private @Valid String descripcionNovedad;

  /**
   **/
  public CrearNovedadClienteCDTInput numeroDocumento(String numeroDocumento) {
    this.numeroDocumento = numeroDocumento;
    return this;
  }

  
  @JsonProperty("numeroDocumento")
  public String getNumeroDocumento() {
    return numeroDocumento;
  }

  @JsonProperty("numeroDocumento")
  public void setNumeroDocumento(String numeroDocumento) {
    this.numeroDocumento = numeroDocumento;
  }

  /**
   **/
  public CrearNovedadClienteCDTInput codigoNovedad(String codigoNovedad) {
    this.codigoNovedad = codigoNovedad;
    return this;
  }

  
  @JsonProperty("codigoNovedad")
  public String getCodigoNovedad() {
    return codigoNovedad;
  }

  @JsonProperty("codigoNovedad")
  public void setCodigoNovedad(String codigoNovedad) {
    this.codigoNovedad = codigoNovedad;
  }

  /**
   **/
  public CrearNovedadClienteCDTInput descripcionNovedad(String descripcionNovedad) {
    this.descripcionNovedad = descripcionNovedad;
    return this;
  }

  
  @JsonProperty("descripcionNovedad")
  public String getDescripcionNovedad() {
    return descripcionNovedad;
  }

  @JsonProperty("descripcionNovedad")
  public void setDescripcionNovedad(String descripcionNovedad) {
    this.descripcionNovedad = descripcionNovedad;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CrearNovedadClienteCDTInput crearNovedadClienteCDTInput = (CrearNovedadClienteCDTInput) o;
    return Objects.equals(this.numeroDocumento, crearNovedadClienteCDTInput.numeroDocumento) &&
        Objects.equals(this.codigoNovedad, crearNovedadClienteCDTInput.codigoNovedad) &&
        Objects.equals(this.descripcionNovedad, crearNovedadClienteCDTInput.descripcionNovedad);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numeroDocumento, codigoNovedad, descripcionNovedad);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CrearNovedadClienteCDTInput {\n");
    
    sb.append("    numeroDocumento: ").append(toIndentedString(numeroDocumento)).append("\n");
    sb.append("    codigoNovedad: ").append(toIndentedString(codigoNovedad)).append("\n");
    sb.append("    descripcionNovedad: ").append(toIndentedString(descripcionNovedad)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

