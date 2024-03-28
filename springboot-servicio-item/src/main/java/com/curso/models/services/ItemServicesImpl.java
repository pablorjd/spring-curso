package com.curso.models.services;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.curso.models.Item;
import com.curso.models.Producto;

@Service
public class ItemServicesImpl implements ItemServices {
	
	@Autowired
	private RestTemplate clienteRest;
	@Override
	public List<Item> findAll() {
		List<Producto> pro = Arrays.asList( clienteRest.getForObject("http://localhost:9090/listar",Producto[].class));
		return pro.stream().map( p -> new Item(p,1)).collect(Collectors.toList());
	}

	@Override
	public Item findById(Long id, Integer cantidad) {
		Map<String, String> pathVariable = new HashMap<String, String>();
		pathVariable.put("id", id.toString());
		Producto pro = clienteRest.getForObject("http://localhost:9090/listar/{id}", Producto.class,pathVariable );
		return new Item(pro, cantidad);
	}

}
