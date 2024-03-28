package com.curso.models.services;

import java.util.List;

import com.curso.models.Item;

public interface ItemServices {

	public List<Item> findAll();
	public Item findById(Long id, Integer cantidad);
}
