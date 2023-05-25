package com.fariasvalentino.Portfolio.service;


import com.fariasvalentino.Portfolio.model.Proyecto;
import com.fariasvalentino.Portfolio.repository.IProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoService implements IProyectoService{
    
    @Autowired
    private IProyectoRepository proyecto;
    
    @Override
    public void agregarProyeto(Proyecto proyecto) {
        this.proyecto.save(proyecto);
    }

    @Override
    public List<Proyecto> mostrarProyectos() {
        return this.proyecto.findAll();
    }

    @Override
    public Proyecto buscarProyecto(Long id) {
        return this.proyecto.findById(id).orElse(null);
    }

    @Override
    public Proyecto editarProyecto(Long id, Proyecto proyecto) {
        
        Proyecto auxProyecto = this.proyecto.findById(id).orElse(null);
        
        auxProyecto.setNombre(proyecto.getNombre());
        auxProyecto.setDescripcion(proyecto.getDescripcion());
        auxProyecto.setUrlProyecto(proyecto.getUrlProyecto());
        auxProyecto.setUrlImagen(proyecto.getUrlImagen());
        
        return auxProyecto;
    }

    @Override
    public void borrarProyecto(Long id) {
        this.proyecto.deleteById(id);
    }
    
    
    
}
