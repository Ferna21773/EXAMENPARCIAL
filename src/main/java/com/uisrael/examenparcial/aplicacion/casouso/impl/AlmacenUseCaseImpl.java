package com.uisrael.examenparcial.aplicacion.casouso.impl;

import java.util.List;

import com.uisrael.examenparcial.aplicacion.casouso.entradas.IAlmacenJpaUseCase;
import com.uisrael.examenparcial.dominio.entidades.Almacen;
import com.uisrael.examenparcial.dominio.repositorios.IAlmacenRepositorio;


public class AlmacenUseCaseImpl implements IAlmacenJpaUseCase{
	
	private final IAlmacenRepositorio repositorio;
	
	

	public AlmacenUseCaseImpl(IAlmacenRepositorio repositorio) {		
		this.repositorio = repositorio;
	}

	@Override
	public Almacen crear(Almacen almacen) {
		// TODO Auto-generated method stub
		return repositorio.guardar(almacen);
	}

	@Override
	public Almacen obtenerPorId(int id) {
		// TODO Auto-generated method stub
		return repositorio.buscarPorId(id).orElseThrow(()-> new RuntimeException("Insumo no encontrado"));
	}

	@Override
	public List<Almacen> listar() {
		// TODO Auto-generated method stub
		return repositorio.listarTodos();
	}

	@Override
	public void eliminar(int id) {
		repositorio.eliminar(id);
		
	}

}
