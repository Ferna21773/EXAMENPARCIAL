package com.uisrael.examenparcial.infraestructura.persistencia.jpa;

import java.io.Serializable;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "insumos")
public class InsumoJpa implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
		
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idInsumo;

    @Column(nullable = false, unique = true)
    private String codigo;

    @Column(nullable = false)
    private String nombre;

    private String unidadMedida;
    private double costoReferencial;

    private boolean estado;
    
}
