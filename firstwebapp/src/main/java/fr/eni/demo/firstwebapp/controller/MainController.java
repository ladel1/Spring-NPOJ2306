package fr.eni.demo.firstwebapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import fr.eni.demo.firstwebapp.bo.Voiture;

@Controller
public class MainController {

	@GetMapping("/")
	public String home(Model model) {
		
		String title = "Accueil";
		Voiture v = new Voiture(1L, "CHIRON", "Bugatti");
		//                   clé   valeur 
		model.addAttribute("title",title);
		model.addAttribute("voiture", v);
		return "index";
	}
	
	@GetMapping("/details/{name:[a-zA-Z]+}")
	public @ResponseBody String page(
			@PathVariable() String name 
			) {
		
		return "Email: "+name;
	}
	
	
	@GetMapping("/connexion")
	public String connexion(
			) {		
		return "redirect:/mon-compte";
	}
	
	@GetMapping("/mon-compte")
	public @ResponseBody String monCompte(
			) {
		return "Tu es connecté 👏";
	}
	
}
