package br.com.professorisidro.democicd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProdutoController {
	
	@GetMapping("/produto")
	public String getAllProdutos() {
		return "Hello World";
	}

}
