package com.fariasvalentino.Portfolio.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {
    
    @Id
    private Long id;
    private String nombre;
    private String apellido;
    private String ocupacion;
    private String email;
    private String telefono;
    private String localizacion;
    private String descripcion;
    private String urlImagen;

    public Persona(Long id, String nombre, String apellido, String ocupacion, String email, String telefono, 
                   String localizacion, String descripcion, String urlImagen) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.ocupacion = ocupacion;
        this.email = email;
        this.telefono = telefono;
        this.localizacion = localizacion;
        this.descripcion = descripcion;
        this.urlImagen = urlImagen;
    }

    public Persona() {
    }
    
    
}
