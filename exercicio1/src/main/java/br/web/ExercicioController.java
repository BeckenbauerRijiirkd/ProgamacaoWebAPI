package br.web;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExercicioController {

	@GetMapping({ "/home", "/primeiro" })
	public String home() {

		return "ESTE ENDPOINT ULTILIZA O VERBO GET";
	}

	@PostMapping({ "/segundo", "/2o" })
	public String segundo() {

		return "ESTE ENDPOINT ULTILIZA O VERBO POST";
	}

	@PutMapping("/terceiro")
	public String terceiro() {

		return "ESTE ENDPOINT ULTILIZA O VERDO PUT";
	}

	@DeleteMapping("/quinto")
	public String quinto() {

		return "ESTE ENDPOINT ULTILIZA O VERBO DELETE";
	}

}
