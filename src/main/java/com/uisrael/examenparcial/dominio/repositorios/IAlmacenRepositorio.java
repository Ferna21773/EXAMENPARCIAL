package com.uisrael.examenparcial.dominio.repositorios;

import java.util.List;
import java.util.Optional;

import com.uisrael.examenparcial.dominio.entidades.Almacen;

public interface IAlmacenRepositorio {
	
	Almacen guardar(Almacen almacen);
	Optional<Almacen> buscarPorId(int id);
	List<Almacen> listarTodos();
	void eliminar(int id);

}
