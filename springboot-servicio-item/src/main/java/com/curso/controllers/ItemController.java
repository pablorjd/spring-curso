package com.curso.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.curso.models.services.ItemServices;

@RestController
public class ItemController {
	
	
	@Autowired
	private ItemServices itemServices;

}
