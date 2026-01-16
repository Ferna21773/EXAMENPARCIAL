package com.uisrael.examenparcial.infraestructura.configuracion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.uisrael.examenparcial.aplicacion.casouso.entradas.IAlmacenJpaUseCase;
import com.uisrael.examenparcial.aplicacion.casouso.entradas.IProveedorUseCase;
import com.uisrael.examenparcial.aplicacion.casouso.impl.AlmacenUseCaseImpl;
import com.uisrael.examenparcial.aplicacion.casouso.impl.ProveedorUseCaseImpl;
import com.uisrael.examenparcial.dominio.repositorios.IAlmacenRepositorio;
import com.uisrael.examenparcial.dominio.repositorios.IProveedorRepositorio;
import com.uisrael.examenparcial.infraestructura.persistencia.adaptadores.AlmacenRepositorioImpl;
import com.uisrael.examenparcial.infraestructura.persistencia.adaptadores.ProveedorRepositorioImpl;
import com.uisrael.examenparcial.infraestructura.persistencia.mapeadores.IAlmacenJpaMapper;
import com.uisrael.examenparcial.infraestructura.persistencia.mapeadores.IProveedorJpaMapper;
import com.uisrael.examenparcial.infraestructura.repositorios.IAlmacenJpaRepositorio;
import com.uisrael.examenparcial.infraestructura.repositorios.IProveedorJpaRepositorio;



@Configuration
public class ConfigGen {

	@Bean
	IProveedorRepositorio proveedorRepositorio(IProveedorJpaRepositorio jpaRepositorio, IProveedorJpaMapper mapper) {
		return new ProveedorRepositorioImpl(jpaRepositorio, mapper);
	}
	
	@Bean
	IProveedorUseCase cursoUseCase(IProveedorRepositorio repositorio) {
		return new ProveedorUseCaseImpl(repositorio);
	}
		
	
	@Bean
	IAlmacenRepositorio insumoRepositorio(IAlmacenJpaRepositorio jpaRepositorio, IAlmacenJpaMapper mapper) {
		return new AlmacenRepositorioImpl(jpaRepositorio, mapper);
	}
	
	@Bean
	IAlmacenJpaUseCase insumoUseCase(IAlmacenRepositorio repositorio) {
		return new AlmacenUseCaseImpl(repositorio);
	}
	
	
	
	
}
