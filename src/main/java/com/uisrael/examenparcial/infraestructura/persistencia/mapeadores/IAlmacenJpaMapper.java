package com.uisrael.examenparcial.infraestructura.persistencia.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.examenparcial.dominio.entidades.Almacen;
import com.uisrael.examenparcial.infraestructura.persistencia.jpa.AlmacenJpa;


@Mapper(componentModel = "spring")
public interface IAlmacenJpaMapper {
	Almacen toDomain(AlmacenJpa entity);
	AlmacenJpa toEntity(Almacen almacen);

}
