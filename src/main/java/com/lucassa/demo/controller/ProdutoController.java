package com.lucassa.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lucassa.demo.entidades.Departamento;
import com.lucassa.demo.entidades.Produto;

@RestController
@RequestMapping(value = "/products")
public class ProdutoController {
	
	@GetMapping
	public List<Produto> pegarObjetos() {
		Departamento d1 =  new Departamento(1L,"Tech");
		Departamento d2 =  new Departamento(2L,"Pet");
		
		Produto p1 = new Produto(1L,"MecBook", 4000.0, d1); 
		Produto p2 = new Produto(2L, "PC-Gamer", 5000.0, d1); 
		Produto p3 = new Produto(3l, "Casa de Pets", 300.0, d2); 
		
		List<Produto> lista = new ArrayList<>();
		lista.add(p1);
		lista.add(p2);
		lista.add(p3);
		
		return lista;
		
	}

}
