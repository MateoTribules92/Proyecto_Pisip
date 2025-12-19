package com.uisrael.cursosapi.infraestructura.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uisrael.cursosapi.infraestructura.persistencia.jpa.EventoJpa;

public interface IEventoRepositorio extends JpaRepository<EventoJpa, Integer>{

}
