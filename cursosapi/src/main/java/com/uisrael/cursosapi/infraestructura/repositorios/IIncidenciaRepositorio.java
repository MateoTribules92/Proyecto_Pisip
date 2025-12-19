package com.uisrael.cursosapi.infraestructura.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uisrael.cursosapi.infraestructura.persistencia.jpa.IncidenciaJpa;

public interface IIncidenciaRepositorio extends JpaRepository<IncidenciaJpa, Integer>{

}
