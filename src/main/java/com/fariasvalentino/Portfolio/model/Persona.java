package com.fariasvalentino.Portfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id;
    private String nombre;
    private String apellido;
    private String ocupacion;
    private String email;
    private String telefono;
    private String localizacion;
    private String descripcion;

    public Persona(Long id, String nombre, String apellido, String ocupacion, String email, String telefono, String localizacion, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.ocupacion = ocupacion;
        this.email = email;
        this.telefono = telefono;
        this.localizacion = localizacion;
        this.descripcion = descripcion;
    }

    public Persona() {
    }
    
    
}
