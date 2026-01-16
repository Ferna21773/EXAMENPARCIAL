package com.uisrael.examenparcial.infraestructura.persistencia.jpa;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "ordenes_compra")
public class OrdenCompraJpa implements Serializable {
	
	
	private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idOrdenCompraJpa;

    @ManyToOne
    @JoinColumn(name = "proveedor_id")
    private ProveedorJpa proveedor;
    
    private Date fechaEmision;

    private String estado;
    private String observacion;

    @OneToMany(mappedBy = "ordenCompra", cascade = CascadeType.ALL)
    private List<OrdenCompraDetalleJpa> detalles;


}
