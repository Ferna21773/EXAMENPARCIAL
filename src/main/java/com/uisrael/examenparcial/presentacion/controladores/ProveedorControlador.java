package com.uisrael.examenparcial.presentacion.controladores;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.uisrael.examenparcial.aplicacion.casouso.entradas.IProveedorUseCase;
import com.uisrael.examenparcial.presentacion.dto.request.ProveedorRequestDTO;
import com.uisrael.examenparcial.presentacion.dto.response.ProveedorResponseDTO;
import com.uisrael.examenparcial.presentacion.mapeadores.IProveedorDtoMapper;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/proveedor")
public class ProveedorControlador {

	private final IProveedorUseCase proveedorUseCase;
	private final IProveedorDtoMapper mapper;
	
	public ProveedorControlador(IProveedorUseCase proveedorUseCase, IProveedorDtoMapper mapper) {		
		this.proveedorUseCase = proveedorUseCase;
		this.mapper = mapper;
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ProveedorResponseDTO crear(@Valid @RequestBody ProveedorRequestDTO request) {
		return mapper.toResponseDto(proveedorUseCase.crear(mapper.toDomain(request)));		
	}
	
	
	@GetMapping
	public List<ProveedorResponseDTO> listar(){
		return proveedorUseCase.listar().stream().map(mapper::toResponseDto).toList();
	}
	
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> eliminar(@PathVariable int id){
		proveedorUseCase.eliminar(id);
		return ResponseEntity.noContent().build();
	}
	
	
}
