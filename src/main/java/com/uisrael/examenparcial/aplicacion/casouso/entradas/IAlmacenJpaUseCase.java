package com.uisrael.examenparcial.aplicacion.casouso.entradas;

import java.util.List;

import com.uisrael.examenparcial.dominio.entidades.Almacen;

public interface IAlmacenJpaUseCase {
	Almacen crear(Almacen almacen);
	Almacen obtenerPorId(int id);
	List<Almacen> listar();
	void eliminar(int id);
}
