package com.uisrael.examenparcial.presentacion.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class AlmacenRequestDTO {
	
	@NotBlank
	private int idAlmacen;
	@NotBlank
    private String nombre;
	@NotBlank
    private String ubicacion;
	@NotBlank
    private boolean estado;

}
