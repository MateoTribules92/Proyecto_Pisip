package com.uisrael.cursosapi.infraestructura.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uisrael.cursosapi.infraestructura.persistencia.jpa.SitioJpa;

public interface ISitioRepositorio extends JpaRepository<SitioJpa, Integer> {

}
