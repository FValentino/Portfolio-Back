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
    public Persona agregarPersona(Persona persona) {
        this.persona.save(persona);
        return persona;
    }
    
    @Override
    public Persona mostrarPersona() {
        return this.persona.findById(1L).orElse(null);
    }

    @Override
    public Persona editarPersona(Persona persona) {
        Persona pers = this.persona.findById(1L).orElse(null);
        
        pers.setNombre(persona.getNombre());
        pers.setApellido(persona.getApellido());
        pers.setOcupacion(persona.getOcupacion());
        pers.setEmail(persona.getEmail());
        pers.setTelefono(persona.getTelefono());
        pers.setLocalizacion(persona.getLocalizacion());
        pers.setDescripcion(persona.getDescripcion());
        pers.setUrlImagen(persona.getUrlImagen());
        
        this.persona.save(pers);
        
        return pers;
    }
    
}
