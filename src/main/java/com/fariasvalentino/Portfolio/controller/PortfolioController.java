package com.fariasvalentino.Portfolio.controller;

import com.fariasvalentino.Portfolio.model.*;
import com.fariasvalentino.Portfolio.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class PortfolioController {
    
    @Autowired
    private IUsuarioService usuario;
    
    
    //Controller usuario
    @PostMapping ("/portfolio/usuario/registrar-usuario")
    public String cargarUsuario(@RequestBody Usuario usuario){
        this.usuario.saveUsuario(usuario);
 
        return "Usuario cargado";
    }
    
    @PostMapping ("/portfolio/usuario/iniciar-sesion")
    public Usuario iniciarUsuario(@RequestBody Usuario usuario){
        Usuario user = this.usuario.findByEmail(usuario.getEmail());
        
        if (user!=null){
            if ( this.usuario.password(user.getPassword(), usuario.getPassword()) ){
                return user;
            }
            else {
                return null;
            } 
        }
        else{
            return null;
        }
    }
    
    @PostMapping ("/portfolio/usuario/cerrar-sesion")
    public Usuario cerrarSesion(){
        return this.usuario.cerrarSesion();
    } 
}
