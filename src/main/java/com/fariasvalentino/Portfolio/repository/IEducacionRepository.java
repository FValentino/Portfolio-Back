package com.fariasvalentino.Portfolio.repository;

import com.fariasvalentino.Portfolio.model.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEducacionRepository extends JpaRepository <Educacion, Long>{
  
}
