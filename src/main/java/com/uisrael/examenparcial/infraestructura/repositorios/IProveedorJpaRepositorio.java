package com.uisrael.examenparcial.infraestructura.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uisrael.examenparcial.infraestructura.persistencia.jpa.ProveedorJpa;

public interface IProveedorJpaRepositorio extends JpaRepository<ProveedorJpa, Integer>{

}
