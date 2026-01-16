package com.uisrael.examenparcial.presentacion.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class ProveedorRequestDTO {
	
	@NotBlank
	private int idProveedor;
	@NotBlank
    private String ruc;
	@NotBlank
    private String razonSocial;
	@NotBlank
    private String telefono;
	@NotBlank
    private String email;
	@NotBlank
    private boolean aprobado;
	@NotBlank
    private boolean estado;

}
