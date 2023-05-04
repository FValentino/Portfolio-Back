package com.fariasvalentino.Portfolio.service;

import com.fariasvalentino.Portfolio.model.Persona;
import com.fariasvalentino.Portfolio.repository.IPersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PersonaService implements IPersonaService {

    @Autowired
    private IPersonaRepository persona;
    
    @Override
    public Persona mostrarPersona() {
        return this.persona.findById(1L).orElse(null);
    }
    
}
