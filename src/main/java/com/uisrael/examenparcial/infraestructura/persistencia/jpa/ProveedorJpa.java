package com.uisrael.examenparcial.infraestructura.persistencia.jpa;

import java.io.Serializable;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "proveedores")
public class ProveedorJpa implements Serializable {
	
	
	private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProveedor;

    @Column(nullable = false, unique = true)
    private String ruc;

    @Column(nullable = false)
    private String razonSocial;

    private String telefono;
    private String email;

    
    private boolean aprobado;

    
    private boolean estado;

    
}
