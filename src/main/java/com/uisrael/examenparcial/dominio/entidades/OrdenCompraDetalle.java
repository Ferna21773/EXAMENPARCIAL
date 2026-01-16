package com.uisrael.examenparcial.dominio.entidades;

import java.io.Serializable;

public class OrdenCompraDetalle implements Serializable{

	private static final long serialVersionUID = 1L;

    private final int idDetalle;
    private final Insumo insumo;
    private final double cantidadSolicitada;
    private final double costoUnitario;
	public OrdenCompraDetalle(int idDetalle, Insumo insumo, double cantidadSolicitada, double costoUnitario) {
		super();
		this.idDetalle = idDetalle;
		this.insumo = insumo;
		this.cantidadSolicitada = cantidadSolicitada;
		this.costoUnitario = costoUnitario;
	}
	public int getIdDetalle() {
		return idDetalle;
	}
	public Insumo getInsumo() {
		return insumo;
	}
	public double getCantidadSolicitada() {
		return cantidadSolicitada;
	}
	public double getCostoUnitario() {
		return costoUnitario;
	}
	
	@Override
	public String toString() {
		return "OrdenCompraDetalle [idDetalle=" + idDetalle + ", insumo=" + insumo + ", cantidadSolicitada="
				+ cantidadSolicitada + ", costoUnitario=" + costoUnitario + "]";
	}
    
    
}
