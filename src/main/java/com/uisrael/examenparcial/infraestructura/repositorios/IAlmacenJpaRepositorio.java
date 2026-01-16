package com.uisrael.examenparcial.infraestructura.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uisrael.examenparcial.infraestructura.persistencia.jpa.AlmacenJpa;


public interface IAlmacenJpaRepositorio extends JpaRepository<AlmacenJpa, Integer>{

}
