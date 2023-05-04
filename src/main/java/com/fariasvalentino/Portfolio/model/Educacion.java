
package com.fariasvalentino.Portfolio.model;

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
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id;
    private String nombre;
    private String titulo;
    private String fechaInicio;
    private String fechaFin;

    public Educacion(Long id, String titulo, String nombre, String fechaInicio, String fechaFin) {
        this.id = id;
        this.nombre = nombre;
        this.titulo = titulo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }
    
    public Educacion(){
        
    }
}
