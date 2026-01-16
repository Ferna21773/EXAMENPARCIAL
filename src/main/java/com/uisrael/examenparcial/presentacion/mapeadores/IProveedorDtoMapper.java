package com.uisrael.examenparcial.presentacion.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.examenparcial.dominio.entidades.Proveedor;
import com.uisrael.examenparcial.presentacion.dto.request.ProveedorRequestDTO;
import com.uisrael.examenparcial.presentacion.dto.response.ProveedorResponseDTO;

@Mapper(componentModel = "spring")
public interface IProveedorDtoMapper {
	
	Proveedor toDomain(ProveedorRequestDTO dto);
	ProveedorResponseDTO toResponseDto(Proveedor proveeedor);

}
