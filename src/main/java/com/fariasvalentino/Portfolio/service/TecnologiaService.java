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
    
    @Override
    public void agregarTecnologia(Tecnologia tecnologia){
        this.tecnologia.save(tecnologia);
    }
    
    @Override
    public List <Tecnologia> listarTecnologias(){
        return this.tecnologia.findAll();
    }

    @Override
    public Tecnologia editarTecnologia(Long id, Tecnologia tecnologia) {
        
        Tecnologia tec = this.tecnologia.findById(id).orElse(null);
        
        tec.setNombre(tecnologia.getNombre());
        tec.setUrlImagen(tecnologia.getUrlImagen());
        
        this.tecnologia.save(tec);
        
        return tec;
    }

    @Override
    public void borrarTecnologia(Long id) {
        this.tecnologia.deleteById(id);
    }

    @Override
    public Tecnologia buscarTecnologia(Long id) {
        return this.tecnologia.findById(id).orElse(null);
    }
    
}
