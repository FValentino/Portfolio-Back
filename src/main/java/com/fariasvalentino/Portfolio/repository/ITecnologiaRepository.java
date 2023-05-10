package com.fariasvalentino.Portfolio.repository;

import com.fariasvalentino.Portfolio.model.Tecnologia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITecnologiaRepository extends JpaRepository <Tecnologia, Long>{
    
}
