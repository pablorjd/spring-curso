package cl.curso.springboot.repository.inteface;

import cl.curso.springboot.pojo.Product;

public interface IProductRepository {
	
	public Product getProductByCode(String code);

}
