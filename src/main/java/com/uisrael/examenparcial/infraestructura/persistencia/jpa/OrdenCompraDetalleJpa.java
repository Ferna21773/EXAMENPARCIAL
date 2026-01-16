package com.uisrael.examenparcial.infraestructura.persistencia.jpa;

import java.io.Serializable;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "orden_compra_detalle")
public class OrdenCompraDetalleJpa implements Serializable {
	
	
	private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idOrdenCompraDetalle;

    @ManyToOne
    @JoinColumn(name = "orden_compra_id")
    private OrdenCompraJpa ordenCompra;

    @ManyToOne
    @JoinColumn(name = "insumo_id")
    private InsumoJpa insumo;

    private double cantidadSolicitada;
    private double costoUnitario;
 
}
