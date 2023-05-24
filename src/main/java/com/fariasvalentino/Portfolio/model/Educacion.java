
package com.fariasvalentino.Portfolio.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Educacion {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 50)
    private String nombre;
    @Column(nullable = false, length = 50)
    private String carrera;
    @Column(length = 70) 
    private String titulo;
    @Column(nullable = false)
    private String fechaInicio;
    private String fechaFin;
    private String urlImagen;

    public Educacion(Long id, String nombre, String carrera,String titulo,
                     String fechaInicio, String fechaFin, String descripcion, String urlImagen) {
        this.id = id;
        this.nombre = nombre;
        this.titulo = titulo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.urlImagen = urlImagen;
    }
    
    public Educacion(){
        
    }
}
