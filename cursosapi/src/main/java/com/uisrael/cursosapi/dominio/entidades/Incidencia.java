package com.uisrael.cursosapi.dominio.entidades;
import java.time.OffsetDateTime;

public final class Incidencia {
	
	  private final long incidentId;
	    private final long deviceId;
	    private final String detalle;
	    private final boolean estado;
	    private final OffsetDateTime createdAt;
	    private final OffsetDateTime resolvedAt;
		
	    public Incidencia(long incidentId, long deviceId, String detalle, boolean estado, OffsetDateTime createdAt,
				OffsetDateTime resolvedAt) {
			super();
			this.incidentId = incidentId;
			this.deviceId = deviceId;
			this.detalle = detalle;
			this.estado = estado;
			this.createdAt = createdAt;
			this.resolvedAt = resolvedAt;
		}

		public long getIncidentId() {
			return incidentId;
		}

		public long getDeviceId() {
			return deviceId;
		}

		public String getDetalle() {
			return detalle;
		}

		public boolean isEstado() {
			return estado;
		}

		public OffsetDateTime getCreatedAt() {
			return createdAt;
		}

		public OffsetDateTime getResolvedAt() {
			return resolvedAt;
		}
	    
	    
	    

}
