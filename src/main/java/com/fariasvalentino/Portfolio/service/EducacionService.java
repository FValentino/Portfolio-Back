package com.fariasvalentino.Portfolio.service;

import com.fariasvalentino.Portfolio.model.Educacion;
import com.fariasvalentino.Portfolio.repository.IEducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EducacionService implements IEducacionService{

    @Autowired
    private IEducacionRepository educacion;
    
    
    @Override
    public void agregarEducacion(Educacion educacion) {
        this.educacion.save(educacion);
    }

    @Override
    public List<Educacion> listarEducacion() {
        return this.educacion.findAll();
    }

    @Override
    public Educacion editarEducacion(Long id, Educacion educacion) {
        Educacion edu = this.educacion.findById(id).orElse(null);
        
        edu.setNombre(educacion.getNombre());
        edu.setTitulo(educacion.getTitulo());
        edu.setFechaInicio(educacion.getFechaInicio());
        edu.setFechaFin(educacion.getFechaFin());
        edu.setUrlImagen(educacion.getUrlImagen());
        
        this.educacion.save(edu);
        
        return edu;
    }

    @Override
    public void borrarEducacion(Long id) {
        this.educacion.deleteById(id);
    }

    @Override
    public Educacion buscarEducacion(Long id) {
        return this.educacion.findById(id).orElse(null);
    }

    
}
