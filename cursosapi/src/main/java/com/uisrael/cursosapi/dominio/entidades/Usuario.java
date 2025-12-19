package com.uisrael.cursosapi.dominio.entidades;
import java.time.LocalDate;
import java.time.OffsetDateTime;


public final class Usuario {
	
	private final long userId;
    private final String internalCode;
    private final String nombre;
    private final String apellido;
    private final String area;
    private final String email;
    private final boolean estado;
    private final LocalDate vigenteDesde;
    private final LocalDate vigenteHasta;
    private final OffsetDateTime createdAt;
    private final OffsetDateTime updatedAt;
	
    
    public Usuario(long userId, String internalCode, String nombre, String apellido, String area, String email,
			boolean estado, LocalDate vigenteDesde, LocalDate vigenteHasta, OffsetDateTime createdAt,
			OffsetDateTime updatedAt) {
		super();
		this.userId = userId;
		this.internalCode = internalCode;
		this.nombre = nombre;
		this.apellido = apellido;
		this.area = area;
		this.email = email;
		this.estado = estado;
		this.vigenteDesde = vigenteDesde;
		this.vigenteHasta = vigenteHasta;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}


	public long getUserId() {
		return userId;
	}


	public String getInternalCode() {
		return internalCode;
	}


	public String getNombre() {
		return nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public String getArea() {
		return area;
	}


	public String getEmail() {
		return email;
	}


	public boolean isEstado() {
		return estado;
	}


	public LocalDate getVigenteDesde() {
		return vigenteDesde;
	}


	public LocalDate getVigenteHasta() {
		return vigenteHasta;
	}


	public OffsetDateTime getCreatedAt() {
		return createdAt;
	}


	public OffsetDateTime getUpdatedAt() {
		return updatedAt;
	}
    
    
    
   
}
