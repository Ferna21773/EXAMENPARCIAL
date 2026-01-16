package com.uisrael.examenparcial.dominio.entidades;

import java.io.Serializable;

public class Almacen implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private final int idAlmacen;
    private final String nombre;
    private final String ubicacion;
    private final boolean estado;
	public Almacen(int idAlmacen, String nombre, String ubicacion, boolean estado) {
		super();
		this.idAlmacen = idAlmacen;
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.estado = estado;
	}
	public int getIdAlmacen() {
		return idAlmacen;
	}
	public String getNombre() {
		return nombre;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public boolean isEstado() {
		return estado;
	}
	@Override
	public String toString() {
		return "Almacen [idAlmacen=" + idAlmacen + ", nombre=" + nombre + ", ubicacion=" + ubicacion + ", estado="
				+ estado + "]";
	}
    
    

    
    
}
