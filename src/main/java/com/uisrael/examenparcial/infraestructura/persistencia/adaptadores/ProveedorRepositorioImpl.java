package com.uisrael.examenparcial.infraestructura.persistencia.adaptadores;

import java.util.List;
import java.util.Optional;

import com.uisrael.examenparcial.dominio.entidades.Proveedor;
import com.uisrael.examenparcial.dominio.repositorios.IProveedorRepositorio;
import com.uisrael.examenparcial.infraestructura.persistencia.jpa.ProveedorJpa;
import com.uisrael.examenparcial.infraestructura.persistencia.mapeadores.IProveedorJpaMapper;
import com.uisrael.examenparcial.infraestructura.repositorios.IProveedorJpaRepositorio;

public class ProveedorRepositorioImpl implements IProveedorRepositorio{
	
	private final IProveedorJpaRepositorio jpaRepository;
	private final IProveedorJpaMapper entityMapper;
	
	
	
	
	public ProveedorRepositorioImpl(IProveedorJpaRepositorio jpaRepository, IProveedorJpaMapper entityMapper) {		
		this.jpaRepository = jpaRepository;
		this.entityMapper = entityMapper;
	}
	
	
	@Override
	public Proveedor guardar(Proveedor proveedor) {
		ProveedorJpa entity=entityMapper.toEntity(proveedor);
		ProveedorJpa guardado=jpaRepository.save(entity);
		return entityMapper.toDomain(guardado);	

	}
	@Override
	public Optional<Proveedor> buscarPorId(int id) {
		return jpaRepository.findById(id).map(entityMapper::toDomain);
	}
	
	
	@Override
	public List<Proveedor> listarTodos() {
		return jpaRepository.findAll().stream().map(entityMapper::toDomain).toList();
	}
	
	
	@Override
	public void eliminar(int id) {
		jpaRepository.deleteById(id);
		
	}
	
	


}
