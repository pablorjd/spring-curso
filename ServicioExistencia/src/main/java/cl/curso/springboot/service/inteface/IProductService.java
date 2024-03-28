package cl.curso.springboot.service.inteface;

import cl.curso.springboot.pojo.Product;

public interface IProductService {
	
	public Product getProductByCode(String code);

}
