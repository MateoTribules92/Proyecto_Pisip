package com.uisrael.cursosapi.infraestructura.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uisrael.cursosapi.infraestructura.persistencia.jpa.AsignacionJpa;

public interface IAsignacionRepositorio extends JpaRepository<AsignacionJpa, Integer>{

}
