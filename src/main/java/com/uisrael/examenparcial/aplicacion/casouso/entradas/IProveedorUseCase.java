package com.uisrael.examenparcial.aplicacion.casouso.entradas;

import java.util.List;

import com.uisrael.examenparcial.dominio.entidades.Proveedor;

public interface IProveedorUseCase {
		
	Proveedor crear(Proveedor proveedor);
	Proveedor obtenerPorId(int id);
	List<Proveedor> listar();
	void eliminar(int id);

}
