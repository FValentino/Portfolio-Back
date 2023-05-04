package com.fariasvalentino.Portfolio.service;

import com.fariasvalentino.Portfolio.model.Usuario;
import com.fariasvalentino.Portfolio.repository.IUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService implements IUsuarioService{

    @Autowired
    IUsuarioRepository usuarioRepo;
    
    @Override
    public void saveUsuario(Usuario usuario) {
        this.usuarioRepo.save(usuario);
    }

    @Override
    public Usuario findByEmail(String email){
        Usuario usuario = this.usuarioRepo.findByEmail(email);
        if (usuario!=null){
            return this.usuarioRepo.findByEmail(email);
        }
        else{
            return null;
        }
    }

    @Override
    public boolean password(String passwordSaved, String passwordObtain) {
        return passwordSaved.equals( passwordObtain );
    }

    @Override
    public Usuario cerrarSesion() {
        return null;
    }
}
