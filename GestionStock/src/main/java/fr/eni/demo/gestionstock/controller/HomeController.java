package fr.eni.demo.gestionstock.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/")
@Scope("session")
public class HomeController {

	private int cpt = 0;
	
	
	@GetMapping("/compteur")
	public @ResponseBody String compteur() {
		cpt++;
		return "cpt: "+cpt;
	}
	
	@GetMapping
	public String index() {
		return "home/index";
	}
	
	
	@GetMapping("/set-cookie")
	public @ResponseBody String setCookie(HttpServletResponse response) {
		Cookie prenomCookie = new Cookie("prenom", "Lucas");		
		response.addCookie(prenomCookie);
		return "ok";
	}
	
	@GetMapping("/get-cookie")
	public @ResponseBody String getCookie(
			@CookieValue(name = "prenom",defaultValue = "azerty") String prenom
			) {
		return "Prénom: "+prenom;
	}
	
}
