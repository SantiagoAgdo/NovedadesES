package com.mibanco.novedadesES.gen.type;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("NovedadCDTDigitalType")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-05-24T10:43:29.234135800-05:00[America/Bogota]")
public class NovedadCDTDigitalType   {
  private @Valid Long id;
  private @Valid String numeroDocumento;
  private @Valid String codigoNovedad;
  private @Valid String descripcionNovedad;
  private @Valid String fechaNovedad;

  /**
   **/
  public NovedadCDTDigitalType id(Long id) {
    this.id = id;
    return this;
  }

  
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(Long id) {
    this.id = id;
  }

  /**
   **/
  public NovedadCDTDigitalType numeroDocumento(String numeroDocumento) {
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
  public NovedadCDTDigitalType codigoNovedad(String codigoNovedad) {
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
  public NovedadCDTDigitalType descripcionNovedad(String descripcionNovedad) {
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

  /**
   **/
  public NovedadCDTDigitalType fechaNovedad(String fechaNovedad) {
    this.fechaNovedad = fechaNovedad;
    return this;
  }

  
  @JsonProperty("fechaNovedad")
  public String getFechaNovedad() {
    return fechaNovedad;
  }

  @JsonProperty("fechaNovedad")
  public void setFechaNovedad(String fechaNovedad) {
    this.fechaNovedad = fechaNovedad;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NovedadCDTDigitalType novedadCDTDigitalType = (NovedadCDTDigitalType) o;
    return Objects.equals(this.id, novedadCDTDigitalType.id) &&
        Objects.equals(this.numeroDocumento, novedadCDTDigitalType.numeroDocumento) &&
        Objects.equals(this.codigoNovedad, novedadCDTDigitalType.codigoNovedad) &&
        Objects.equals(this.descripcionNovedad, novedadCDTDigitalType.descripcionNovedad) &&
        Objects.equals(this.fechaNovedad, novedadCDTDigitalType.fechaNovedad);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, numeroDocumento, codigoNovedad, descripcionNovedad, fechaNovedad);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NovedadCDTDigitalType {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    numeroDocumento: ").append(toIndentedString(numeroDocumento)).append("\n");
    sb.append("    codigoNovedad: ").append(toIndentedString(codigoNovedad)).append("\n");
    sb.append("    descripcionNovedad: ").append(toIndentedString(descripcionNovedad)).append("\n");
    sb.append("    fechaNovedad: ").append(toIndentedString(fechaNovedad)).append("\n");
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

