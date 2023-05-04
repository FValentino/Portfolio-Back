package com.fariasvalentino.Portfolio.repository;

import com.fariasvalentino.Portfolio.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuarioRepository extends JpaRepository <Usuario, Long> { 
    
    public Usuario findByEmail(String email);
}
