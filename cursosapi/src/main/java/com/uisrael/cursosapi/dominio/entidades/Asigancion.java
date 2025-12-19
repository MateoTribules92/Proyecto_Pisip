package com.uisrael.cursosapi.dominio.entidades;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.OffsetDateTime;

public final class Asigancion {

	 	private final long assignmentId;
	    private final long userId;
	    private final long deviceId;
	    private final long siteId;
	    private final LocalTime horarioInicio;
	    private final LocalTime horarioFin;
	    private final LocalDate fechaDesde;
	    private final LocalDate fechaHasta;
	    private final boolean activo;
	    private final OffsetDateTime createdAt;
		
	    public Asigancion(long assignmentId, long userId, long deviceId, long siteId, LocalTime horarioInicio,
				LocalTime horarioFin, LocalDate fechaDesde, LocalDate fechaHasta, boolean activo,
				OffsetDateTime createdAt) {
			super();
			this.assignmentId = assignmentId;
			this.userId = userId;
			this.deviceId = deviceId;
			this.siteId = siteId;
			this.horarioInicio = horarioInicio;
			this.horarioFin = horarioFin;
			this.fechaDesde = fechaDesde;
			this.fechaHasta = fechaHasta;
			this.activo = activo;
			this.createdAt = createdAt;
		}

		public long getAssignmentId() {
			return assignmentId;
		}

		public long getUserId() {
			return userId;
		}

		public long getDeviceId() {
			return deviceId;
		}

		public long getSiteId() {
			return siteId;
		}

		public LocalTime getHorarioInicio() {
			return horarioInicio;
		}

		public LocalTime getHorarioFin() {
			return horarioFin;
		}

		public LocalDate getFechaDesde() {
			return fechaDesde;
		}

		public LocalDate getFechaHasta() {
			return fechaHasta;
		}

		public boolean isActivo() {
			return activo;
		}

		public OffsetDateTime getCreatedAt() {
			return createdAt;
		}
	    
	    
	    
	    
}
