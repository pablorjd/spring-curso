package cl.curso.springboot.controllers;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.curso.springboot.pojo.Product;
import cl.curso.springboot.service.inteface.IProductService;

@RestController
@RequestMapping(value = "/api")
public class ProductController {
	
	@Autowired
	private IProductService service;

	@PostMapping(value = "/product/{code}")
	public String getProductByCode(@PathVariable("code") String code) {
		Product p =  this.service.getProductByCode(code);
		if (Objects.nonNull(p)) {
			return "Producto Encontroado";
		} else {
			return "Producto No Encontroado";
		}
	}
}
