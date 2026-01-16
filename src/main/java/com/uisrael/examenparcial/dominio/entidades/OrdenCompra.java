package com.uisrael.examenparcial.dominio.entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class OrdenCompra implements Serializable{

	private static final long serialVersionUID = 1L;

    private final int idOrdenCompra;
    private final Proveedor proveedor;
    private final Date fechaEmision;
    private final String estado;
    private final String observacion;
    private final List<OrdenCompraDetalle> detalles;
	public OrdenCompra(int idOrdenCompra, Proveedor proveedor, Date fechaEmision, String estado, String observacion,
			List<OrdenCompraDetalle> detalles) {
		super();
		this.idOrdenCompra = idOrdenCompra;
		this.proveedor = proveedor;
		this.fechaEmision = fechaEmision;
		this.estado = estado;
		this.observacion = observacion;
		this.detalles = detalles;
	}
	public int getIdOrdenCompra() {
		return idOrdenCompra;
	}
	public Proveedor getProveedor() {
		return proveedor;
	}
	public Date getFechaEmision() {
		return fechaEmision;
	}
	public String getEstado() {
		return estado;
	}
	public String getObservacion() {
		return observacion;
	}
	public List<OrdenCompraDetalle> getDetalles() {
		return detalles;
	}
	@Override
	public String toString() {
		return "OrdenCompra [idOrdenCompra=" + idOrdenCompra + ", proveedor=" + proveedor + ", fechaEmision="
				+ fechaEmision + ", estado=" + estado + ", observacion=" + observacion + ", detalles=" + detalles + "]";
	}
    
    
    

}
