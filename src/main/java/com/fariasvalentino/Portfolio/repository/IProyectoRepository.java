package com.fariasvalentino.Portfolio.repository;

import com.fariasvalentino.Portfolio.model.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProyectoRepository extends JpaRepository <Proyecto, Long>{

}
