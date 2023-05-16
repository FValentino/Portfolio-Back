package com.fariasvalentino.Portfolio.service;

import com.fariasvalentino.Portfolio.model.Persona;

public interface IPersonaService {
    
    public Persona agregarPersona(Persona persona);
    
    public Persona mostrarPersona();
    
    public Persona editarPersona(Persona persona);
}
