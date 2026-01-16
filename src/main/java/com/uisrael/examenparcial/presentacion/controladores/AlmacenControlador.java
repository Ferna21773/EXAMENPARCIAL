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

import com.uisrael.examenparcial.aplicacion.casouso.entradas.IAlmacenJpaUseCase;
import com.uisrael.examenparcial.presentacion.dto.request.AlmacenRequestDTO;
import com.uisrael.examenparcial.presentacion.dto.response.AlmacenResponseDTO;
import com.uisrael.examenparcial.presentacion.mapeadores.IAlmacenDtoMapper;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/almacen")
public class AlmacenControlador {
	
	
	private final IAlmacenJpaUseCase insumoUseCase;
	private final IAlmacenDtoMapper mapper;
	
	
	
	public AlmacenControlador(IAlmacenJpaUseCase insumoUseCase, IAlmacenDtoMapper mapper) {		
		this.insumoUseCase = insumoUseCase;
		this.mapper = mapper;
	}


	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public AlmacenResponseDTO crear(@Valid @RequestBody AlmacenRequestDTO request) {
		return mapper.toResponseDto(insumoUseCase.crear(mapper.toDomain(request)));		
	}
	
	
	@GetMapping
	public List<AlmacenResponseDTO> listar(){
		return insumoUseCase.listar().stream().map(mapper::toResponseDto).toList();
	}
	
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> eliminar(@PathVariable int id){
		insumoUseCase.eliminar(id);
		return ResponseEntity.noContent().build();
	}

}
