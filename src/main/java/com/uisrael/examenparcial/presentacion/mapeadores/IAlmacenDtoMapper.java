package com.uisrael.examenparcial.presentacion.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.examenparcial.dominio.entidades.Almacen;
import com.uisrael.examenparcial.presentacion.dto.request.AlmacenRequestDTO;
import com.uisrael.examenparcial.presentacion.dto.response.AlmacenResponseDTO;


@Mapper(componentModel = "spring")
public interface IAlmacenDtoMapper {
	
	Almacen toDomain(AlmacenRequestDTO dto);
	AlmacenResponseDTO toResponseDto(Almacen insumo);

}
