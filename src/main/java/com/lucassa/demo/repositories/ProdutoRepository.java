package com.lucassa.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucassa.demo.entidades.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

	List<Produto> findAll();

}
