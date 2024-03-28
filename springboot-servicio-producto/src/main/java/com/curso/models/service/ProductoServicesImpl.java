package com.curso.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.curso.models.dao.IProductoDao;
import com.curso.models.entity.Producto;

@Service
public class ProductoServicesImpl implements IProductoService{
	
	@Autowired
	private IProductoDao productoDao;

	@Override
	@Transactional(readOnly = true)
	public List<Producto> findAll() {
		// TODO Auto-generated method stub
		return (List<Producto>) productoDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Producto findById(Long id) {
		// TODO Auto-generated method stub
		return productoDao.findById(id).orElse(null);
	}

}
