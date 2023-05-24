package com.fariasvalentino.Portfolio.service;

import com.fariasvalentino.Portfolio.model.Proyecto;
import java.util.List;

public interface IProyectoService {
    
    public void agregarProyeto(Proyecto proyecto);
    
    public List <Proyecto> mostrarProyectos();
    
    public Proyecto buscarProyecto(Long id);
    
    public Proyecto editarProyecto(Long id, Proyecto proyecto);
    
    public void borrarProyecto(Long id);
    
}
