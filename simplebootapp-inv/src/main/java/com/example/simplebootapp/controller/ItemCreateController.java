package com.example.simplebootapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemCreateController {

	@RequestMapping("/")
	public String itemCreate() {
		return "Hello Item";
	}
	
	
	@RequestMapping("/newEndPoint")
	public String itemCreateNew() {
		return "Hello Item. This is new endpoint.";
	}
}
