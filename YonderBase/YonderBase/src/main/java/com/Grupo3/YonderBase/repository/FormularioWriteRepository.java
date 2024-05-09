package com.Grupo3.YonderBase.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Grupo3.YonderBase.model.FormularioWrite;

public interface FormularioWriteRepository extends JpaRepository<FormularioWrite, Long>{
    
    List<FormularioWrite> findAll();
}
