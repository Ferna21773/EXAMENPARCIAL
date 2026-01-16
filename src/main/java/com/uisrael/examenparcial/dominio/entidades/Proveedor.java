package com.uisrael.examenparcial.dominio.entidades;

import java.io.Serializable;

public class Proveedor implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private final int idProveedor;
    private final String ruc;
    private final String razonSocial;
    private final String telefono;
    private final String email;
    private final boolean aprobado;
    private final boolean estado;
    
    
	public Proveedor(int idProveedor, String ruc, String razonSocial, String telefono, String email, boolean aprobado,
			boolean estado) {
		super();
		this.idProveedor = idProveedor;
		this.ruc = ruc;
		this.razonSocial = razonSocial;
		this.telefono = telefono;
		this.email = email;
		this.aprobado = aprobado;
		this.estado = estado;
	}


	public int getIdProveedor() {
		return idProveedor;
	}


	public String getRuc() {
		return ruc;
	}


	public String getRazonSocial() {
		return razonSocial;
	}


	public String getTelefono() {
		return telefono;
	}


	public String getEmail() {
		return email;
	}


	public boolean isAprobado() {
		return aprobado;
	}


	public boolean isEstado() {
		return estado;
	}


	@Override
	public String toString() {
		return "Proveedor [idProveedor=" + idProveedor + ", ruc=" + ruc + ", razonSocial=" + razonSocial + ", telefono="
				+ telefono + ", email=" + email + ", aprobado=" + aprobado + ", estado=" + estado + "]";
	}
    
    

}
