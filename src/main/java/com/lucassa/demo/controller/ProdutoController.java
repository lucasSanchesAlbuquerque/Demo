package com.lucassa.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lucassa.demo.entidades.Produto;
import com.lucassa.demo.repositories.ProdutoRepository;

@RestController
@RequestMapping(value = "/products")
public class ProdutoController {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@GetMapping
	public List<Produto> pegarObjetos() {
		List<Produto> lista = produtoRepository.findAll();
		return lista;
	}

}
