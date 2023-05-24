package com.mibanco.novedadesES.dao.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name= "novedad_cdt_digital")
public class NovedadesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String numeroDocumento;
    private String codigoNovedad;
    private String descipcionNovedad;
    private Date fechaNovedad;
}
