package com.example.demo.entity;
import lombok.Data;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Data
@Entity
@Table(name="tbl_servicios" )
public class Servicios {

    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private long id;
    private String nombre;
    private String descripcion;
    private String precio;

}
