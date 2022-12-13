package com.example.demo.model;

public class ArtigoNotFoundException extends RuntimeException {

	ArtigoNotFoundException(Long id) {
	    super("Artigo " + id + " não encontrado");
	  }
}
