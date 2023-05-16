package com.fariasvalentino.Portfolio.service;

import com.fariasvalentino.Portfolio.model.Tecnologia;
import java.util.List;

public interface ITecnologiaService {

    public void agregarTecnologia(Tecnologia tecnologia);
    
    public Tecnologia editarTecnologia(Long id, Tecnologia tecnologia);
    
    public void borrarTecnologia(Long id);
    
    public List <Tecnologia> listarTecnologias();
    
    public Tecnologia buscarTecnologia(Long id);
}
