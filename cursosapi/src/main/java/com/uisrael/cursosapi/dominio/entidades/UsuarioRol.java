package com.uisrael.cursosapi.dominio.entidades;
import java.time.OffsetDateTime;

public final class UsuarioRol {
	
	private final long userId;
    private final long roleId;
    private final OffsetDateTime assignedAt;
	public UsuarioRol(long userId, long roleId, OffsetDateTime assignedAt) {
	
		super();
		this.userId = userId;
		this.roleId = roleId;
		this.assignedAt = assignedAt;
	}
	
	public long getUserId() {
		return userId;
	}
	public long getRoleId() {
		return roleId;
	}
	public OffsetDateTime getAssignedAt() {
		return assignedAt;
	}
    
    
}
