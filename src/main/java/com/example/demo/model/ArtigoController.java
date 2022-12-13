package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArtigoController {
	
	private List<Artigo> lista = new ArrayList<Artigo>();
	
	@GetMapping("/")
	public String indice() {
		return "Back-end Challenge 2021 🏅 - Space Flight News";
	}
	
	@GetMapping("/artigos")
	List<Artigo> all() {
	    return this.lista;
	}

	@PostMapping("/artigos")
	public String create(@RequestBody Artigo artigo) {
		
		lista.add(artigo);
		return "Adicionado com sucesso";
	}
 
	@GetMapping("/artigos/{id}")
	Artigo obterArtigo (@PathVariable Long id) {
		
		return lista.get((Math.toIntExact(id)));
	}

	 @PutMapping("/artigos/{id}")
	  Artigo alterarArtigo(@RequestBody Artigo newArtigo, @PathVariable Long id) {
	    for (int i = 0; i < lista.size(); i++) {
	    	if (lista.get(i).getId() == id) {
	    		lista.set(i, newArtigo);
	    		return lista.get(i);
	    	}
	    }
	    return lista.get(10000);
	  }
	
	@DeleteMapping("/artigos/{id}")
	  void deleteArtigo(@PathVariable Long id) {
	    for (int i = 0; i < lista.size(); i++) {
	    	if (lista.get(i).getId() == id) {
	    		lista.remove(i);
	    	}
	    }
	  }

}
