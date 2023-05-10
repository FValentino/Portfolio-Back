package com.fariasvalentino.Portfolio.service;

import com.fariasvalentino.Portfolio.model.Educacion;
import java.util.List;

public interface IEducacionService {
    public void agregarEducacion(Educacion educacion);
    
    public List <Educacion> listarEducacion();
}
