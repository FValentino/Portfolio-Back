package com.fariasvalentino.Portfolio.service;

import com.fariasvalentino.Portfolio.model.Tecnologia;
import com.fariasvalentino.Portfolio.repository.ITecnologiaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TecnologiaService implements ITecnologiaService{

    @Autowired 
    private ITecnologiaRepository tecnologia;
    
    public void agregarTecnologia(Tecnologia tecnologia){
        this.tecnologia.save(tecnologia);
    }
    
    public List <Tecnologia> listarTecnologias(){
        return this.tecnologia.findAll();
    }

    @Override
    public Tecnologia editarTecnologia(String nombre) {
        return null;
    }

    @Override
    public void borrarTecnologia(Long id) {}
}
