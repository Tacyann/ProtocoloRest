package com.protocolrest.protocolrest.api;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController


public class AppController {
    @GetMapping("/")
	public String home() {
		return "Protocol Rest - API";	
	}
	
	@DeleteMapping("/")
	public String umMetodoComVerboDelete() {
		return "O verbo HTTP usado foi o DELETE";	
	}
	
	@PutMapping("/")
	public String umMetodoComVerboPut() {
		return "O verbo HTTP usado foi o PUT";	
	}
	
	@PutMapping("/estudante")
	public String enviarUmaVariavelComVerboPut(@RequestBody String var ) {
		return "O verbo HTTP usado foi o PUT. \n"
				+ "O nome é: " + var;	
	}
	
	
	
	@PostMapping("/")
	public String umMetodoComVerboPost() {
		return "O verbo HTTP usado foi o POST";	
	}
	
	@PostMapping("/{variavel}")
	public String receberUmaVariavelComVerboPut(@PathVariable("variavel") String var ) {
		return "O verbo HTTP usado foi o POST. \n"
				+ "O nome é: " + var;	
	}
}
