package com.uisrael.cursosapi.infraestructura.persistencia.jpa;

import java.io.Serializable;
import java.time.OffsetDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "evento")
public class EventoJpa implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long eventId;
	private long deviceId;
	private Long userId;
	private String reasonCode;
	private OffsetDateTime timestamp;
	private String rawPayload;
	private OffsetDateTime createdAt;

	

}
