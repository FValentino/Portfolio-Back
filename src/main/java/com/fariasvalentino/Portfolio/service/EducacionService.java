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

    
}
