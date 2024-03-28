package cl.curso.springboot.repository.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.stereotype.Repository;

import cl.curso.springboot.pojo.Product;
import cl.curso.springboot.repository.inteface.IProductRepository;

@Repository
public class ProductImpl implements IProductRepository{

	
	
	private List<Product> products = new ArrayList<>();
	
	public ProductImpl() {
		products.add(new Product(1234,"ariel"));
		products.add(new Product(1232,"ace"));
		products.add(new Product(3234,"cloro"));
		products.add(new Product(2321,"atun"));
	}
	@Override
	public Product getProductByCode(String code) {
		
			for(Product p : this.products) {
				
				if(p.getName().charAt(0)==code.charAt(0)) {
					return p;
				}
			}
		
		return null;
	}

}
