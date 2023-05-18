package com.fariasvalentino.Portfolio.service;

import com.fariasvalentino.Portfolio.model.Usuario;

public interface IUsuarioService {
    
    public void saveUsuario(Usuario usuario);
    
    public Usuario findByEmail(String email);
    
    public boolean password(String passwordSaved, String passwordObtain);
    
    public Usuario cerrarSesion(Usuario usuario);
}
