package com.fariasvalentino.Portfolio.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {
    
    @Id
    private Long id;
    @Column (nullable = false, length = 50)
    private String nombre;
    @Column (nullable = false, length = 50)
    private String apellido;
    @Column (nullable = false, length = 70)
    private String ocupacion;
    @Column (nullable = false, length = 50)
    private String email;
    @Column (nullable = false, length = 15)
    private String telefono;
    @Column (nullable = false, length = 50)
    private String localizacion;
    @Column (nullable = false, length = 100)
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
