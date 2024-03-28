package com.curso.models.service;

import java.util.List;

import com.curso.models.entity.Producto;

public interface IProductoService {

	public List<Producto> findAll();
	public Producto findById(Long id);
}
