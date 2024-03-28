package cl.curso.springboot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.curso.springboot.pojo.Product;
import cl.curso.springboot.repository.inteface.IProductRepository;
import cl.curso.springboot.service.inteface.IProductService;


@Service
public class ProductServiceImpl implements IProductService {
	
	@Autowired
	private IProductRepository repo;

	@Override
	public Product getProductByCode(String code) {
		// TODO Auto-generated method stub
		return this.repo.getProductByCode(code);
	}

}
