package fr.eni.tp.Filmotheque.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes({"membre"})
public class MainController {

	@GetMapping("/")
	String index() {
		return "home/index";
	}
	
}
