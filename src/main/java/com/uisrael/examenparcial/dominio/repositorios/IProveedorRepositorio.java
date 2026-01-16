package com.uisrael.examenparcial.dominio.repositorios;

import java.util.List;
import java.util.Optional;

import com.uisrael.examenparcial.dominio.entidades.Proveedor;

public interface IProveedorRepositorio {
	
	Proveedor guardar(Proveedor proveedor);
	Optional<Proveedor> buscarPorId(int id);
	List<Proveedor> listarTodos();
	void eliminar(int id);

}
