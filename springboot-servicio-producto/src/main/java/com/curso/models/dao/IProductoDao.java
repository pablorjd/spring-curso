package com.curso.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.curso.models.entity.Producto;

public interface IProductoDao extends CrudRepository<Producto, Long> {
	
}
