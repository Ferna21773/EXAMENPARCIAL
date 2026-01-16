package com.uisrael.examenparcial.infraestructura.persistencia.adaptadores;

import java.util.List;
import java.util.Optional;

import com.uisrael.examenparcial.dominio.entidades.Almacen;
import com.uisrael.examenparcial.dominio.repositorios.IAlmacenRepositorio;
import com.uisrael.examenparcial.infraestructura.persistencia.jpa.AlmacenJpa;
import com.uisrael.examenparcial.infraestructura.persistencia.mapeadores.IAlmacenJpaMapper;
import com.uisrael.examenparcial.infraestructura.repositorios.IAlmacenJpaRepositorio;


public class AlmacenRepositorioImpl implements IAlmacenRepositorio {
	
	private final IAlmacenJpaRepositorio jpaRepository;
	private final IAlmacenJpaMapper entityMapper;
			

	public AlmacenRepositorioImpl(IAlmacenJpaRepositorio jpaRepository, IAlmacenJpaMapper entityMapper) {		
		this.jpaRepository = jpaRepository;
		this.entityMapper = entityMapper;
	}

	@Override
	public Almacen guardar(Almacen almacen) {
		AlmacenJpa entity=entityMapper.toEntity(almacen);
		AlmacenJpa guardado=jpaRepository.save(entity);
		return entityMapper.toDomain(guardado);	

	}

	@Override
	public Optional<Almacen> buscarPorId(int id) {
		return jpaRepository.findById(id).map(entityMapper::toDomain);
	}

	@Override
	public List<Almacen> listarTodos() {
		return jpaRepository.findAll().stream().map(entityMapper::toDomain).toList();
	}

	@Override
	public void eliminar(int id) {
		jpaRepository.deleteById(id);
		
	}
	
	

}
