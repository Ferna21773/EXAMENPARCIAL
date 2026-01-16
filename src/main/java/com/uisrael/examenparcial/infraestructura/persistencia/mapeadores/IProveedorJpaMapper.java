package com.uisrael.examenparcial.infraestructura.persistencia.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.examenparcial.dominio.entidades.Proveedor;
import com.uisrael.examenparcial.infraestructura.persistencia.jpa.ProveedorJpa;

@Mapper(componentModel = "spring")
public interface IProveedorJpaMapper {
	Proveedor toDomain(ProveedorJpa entity);
	ProveedorJpa toEntity(Proveedor proveedor);
}
