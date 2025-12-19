package com.uisrael.cursosapi.infraestructura.persistencia.jpa;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.OffsetDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "asignacion")
public class AsignacionJpa implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long assignmentId;
	private long userId;
	private long deviceId;
	private long siteId;
	private LocalTime horarioInicio;
	private LocalTime horarioFin;
	private LocalDate fechaDesde;
	private LocalDate fechaHasta;
	private boolean activo;
	private OffsetDateTime createdAt;

	
	

}
