package com.fariasvalentino.Portfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Usuario {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String password;

    public Usuario(Long id, String email, String password) {
        
        this.id = id;
        this.email = email;
        this.password = password;
    }

    public Usuario() {
    }
    
}
