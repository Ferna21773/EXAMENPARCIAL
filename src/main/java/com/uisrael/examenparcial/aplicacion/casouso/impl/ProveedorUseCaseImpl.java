package com.uisrael.examenparcial.aplicacion.casouso.impl;

import java.util.List;

import com.uisrael.examenparcial.aplicacion.casouso.entradas.IProveedorUseCase;
import com.uisrael.examenparcial.dominio.entidades.Proveedor;
import com.uisrael.examenparcial.dominio.repositorios.IProveedorRepositorio;


public class ProveedorUseCaseImpl implements IProveedorUseCase{
	
	private final IProveedorRepositorio repositorio;
	
	

	public ProveedorUseCaseImpl(IProveedorRepositorio repositorio) {		
		this.repositorio = repositorio;
	}

	@Override
	public Proveedor crear(Proveedor proveedor) {
		return repositorio.guardar(proveedor);
	}

	@Override
	public Proveedor obtenerPorId(int id) {
		return repositorio.buscarPorId(id).orElseThrow(()-> new RuntimeException("Proveedor no encontrado"));
	}

	@Override
	public List<Proveedor> listar() {
		// TODO Auto-generated method stub
		return repositorio.listarTodos();
	}

	@Override
	public void eliminar(int id) {
		repositorio.eliminar(id);
		
	}

}
