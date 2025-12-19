package com.uisrael.cursosapi.infraestructura.persistencia.jpa;

import java.io.Serializable;
import java.net.InetAddress;
import java.time.OffsetDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "auditoria")
public class AuditoriaJpa implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long auditId;
	private long userId;
	private String accion;
	private String entidad;
	private Long entidadId;
	private OffsetDateTime timestamp;
	private InetAddress ipOrigen;


	
	

}
