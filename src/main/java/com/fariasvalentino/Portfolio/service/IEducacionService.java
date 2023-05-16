package com.fariasvalentino.Portfolio.service;

import com.fariasvalentino.Portfolio.model.Educacion;
import java.util.List;

public interface IEducacionService {
    
    public void agregarEducacion(Educacion educacion);
    
    public Educacion editarEducacion(Long id, Educacion educacion);
    
    public void borrarEducacion(Long id);
    
    public List <Educacion> listarEducacion();
    
    public Educacion buscarEducacion (Long id);
}
