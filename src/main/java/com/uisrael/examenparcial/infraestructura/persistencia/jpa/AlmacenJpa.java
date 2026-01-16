package com.uisrael.examenparcial.infraestructura.persistencia.jpa;

import java.io.Serializable;

import lombok.Data;
import jakarta.persistence.*;

@Data
@Entity
@Table(name = "almacenes")
public class AlmacenJpa implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAlmacen;

    private String nombre;
    private String ubicacion;
    private boolean estado;

}
