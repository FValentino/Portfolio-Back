package com.fariasvalentino.Portfolio.controller;

import com.fariasvalentino.Portfolio.model.*;
import com.fariasvalentino.Portfolio.service.*;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController; 

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
    @Autowired
    private IProyectoService proyecto;
    
    
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
    public Usuario cerrarUsuario(@RequestBody Usuario usuario){
        return this.usuario.cerrarSesion(usuario);
    }
    
    
    
    //Controller persona
    @PostMapping ("/portfolio/persona/registrar")
    public Persona cargarUsuario(@RequestBody Persona persona){
        this.persona.agregarPersona(persona);
 
        return persona;
    }
    
    @GetMapping ("/portfolio/persona")
    public Persona mostrarPersona(){
        return this.persona.mostrarPersona();
    }
    
    @PutMapping ("/portfolio/persona/editar")
    public Persona editarPersona(@RequestBody Persona persona){
        return this.persona.editarPersona(persona);
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
    
    @GetMapping ("/portfolio/tecnologia/{id}")
    @ResponseBody
    public Tecnologia buscarTecnologia(@PathVariable Long id){
        return this.tecnologia.buscarTecnologia(id);
    }
    
    @DeleteMapping ("/portfolio/tecnologia/borrar")
    public void borrarTecnologia(@RequestParam Long id){
        this.tecnologia.borrarTecnologia(id);
    }
    
    @PutMapping ("/portfolio/tecnologia/editar/{id}")
    public Tecnologia editarTecnologia(@PathVariable Long id, @RequestBody Tecnologia tecnologia){
        return this.tecnologia.editarTecnologia(id, tecnologia);
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
    
    @GetMapping ("portfolio/educacion/{id}")
    @ResponseBody
    public Educacion buscarEducacion(@PathVariable Long id){
        return this.educacion.buscarEducacion(id);
    }
    
    @DeleteMapping ("/portfolio/educacion/borrar")
    public void borrarEducacion(@RequestParam Long id){
        this.educacion.borrarEducacion(id);
    }
    
    @PutMapping ("/portfolio/educacion/editar/{id}")
    public Educacion editarEducacion(@PathVariable Long id, @RequestBody Educacion educacion){
        return this.educacion.editarEducacion(id, educacion);
    }
    
    //Proyecto controller
    @PostMapping ("portfolio/proyecto/agregar")
    public void agregarProyecto(@RequestBody Proyecto proyecto){
        this.proyecto.agregarProyeto(proyecto);
    }
    
    @GetMapping ("portfolio/proyecto")
    public List <Proyecto> mostrarProyectos(){
       return this.proyecto.mostrarProyectos();
    }
    
    @GetMapping ("portfolio/proyecto/{id}")
    @ResponseBody
    public Proyecto mostrarProyecto(@PathVariable Long id){
       return this.proyecto.buscarProyecto(id);
    }
    
    @PutMapping ("portfolio/proyecto/editar/{id}")
    public Proyecto editarProyecto(@PathVariable Long id, @RequestBody Proyecto proyecto){
        return this.proyecto.editarProyecto(id, proyecto);
    }
    
    @DeleteMapping ("portfolio/proyecto/eliminar")
    public void eliminarProyecto(@RequestParam Long id){
        this.proyecto.borrarProyecto(id);
    }
}
