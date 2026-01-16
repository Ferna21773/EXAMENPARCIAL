package com.uisrael.examenparcial.dominio.entidades;

import java.io.Serializable;

public class Insumo implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private final int idInsumo;
    private final String codigo;
    private final String nombre;
    private final String unidadMedida;
    private final double costoReferencial;
    private final boolean estado;
	public Insumo(int idInsumo, String codigo, String nombre, String unidadMedida, double costoReferencial,
			boolean estado) {
		super();
		this.idInsumo = idInsumo;
		this.codigo = codigo;
		this.nombre = nombre;
		this.unidadMedida = unidadMedida;
		this.costoReferencial = costoReferencial;
		this.estado = estado;
	}
	public int getIdInsumo() {
		return idInsumo;
	}
	public String getCodigo() {
		return codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public String getUnidadMedida() {
		return unidadMedida;
	}
	public double getCostoReferencial() {
		return costoReferencial;
	}
	public boolean isEstado() {
		return estado;
	}
	@Override
	public String toString() {
		return "Insumo [idInsumo=" + idInsumo + ", codigo=" + codigo + ", nombre=" + nombre + ", unidadMedida="
				+ unidadMedida + ", costoReferencial=" + costoReferencial + ", estado=" + estado + "]";
	}
    
    

}
