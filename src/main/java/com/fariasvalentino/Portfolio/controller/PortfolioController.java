package com.fariasvalentino.Portfolio.controller;

import com.fariasvalentino.Portfolio.model.*;
import com.fariasvalentino.Portfolio.service.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@CrossOrigin
@RestController
public class PortfolioController {
    
    @Autowired
    private IUsuarioService usuario;
    @Autowired
    private IPersonaService persona;
    @Autowired
    private ITecnologiaService tecnologia;
    @Autowired
    private IEducacionService educacion;
    
    
    //Controller usuario
    @PostMapping ("/portfolio/usuario/registrar-usuario")
    public Usuario cargarUsuario(@RequestBody Usuario usuario){
        this.usuario.saveUsuario(usuario);
 
        return usuario;
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
    
    //Controller persona
    @GetMapping ("/portfolio/persona")
    public Persona mostrarPersona(){
        return this.persona.mostrarPersona();
    }
    
    //Controller Tecnologia
    @PostMapping ("/portfolio/tecnologia/agregar")
    @ResponseBody
    public Tecnologia agregarTecnologia(@RequestBody Tecnologia tecnologia){
        
        this.tecnologia.agregarTecnologia(tecnologia);
        
        return tecnologia;
    }
    
    @GetMapping ("/portfolio/tecnologia")
    @ResponseBody
    public List <Tecnologia> listarTecnologias(){
        return this.tecnologia.listarTecnologias();
    }
    
    //Controller Educacion
    @PostMapping ("/portfolio/educacion/agregar")
    @ResponseBody
    public Educacion agregarEducacion(@RequestBody Educacion educacion){
        
        this.educacion.agregarEducacion(educacion);
        
        return educacion;
    }
    
    @GetMapping ("portfolio/educacion")
    @ResponseBody
    public List <Educacion> listarEducacion(){
        return this.educacion.listarEducacion();
    }
}
