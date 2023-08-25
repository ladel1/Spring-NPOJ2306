package fr.eni.tp.Filmotheque.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import fr.eni.tp.Filmotheque.bll.ContexteService;
import fr.eni.tp.Filmotheque.bo.Membre;

@Controller
@SessionAttributes({"membre"})
public class ContexteController {

	@Autowired
	private ContexteService contexteService;
	
	@ModelAttribute("membre")
	public Membre initMembre() {
		System.err.println("Init Membre");
		return new Membre();
	}
	
	@GetMapping("/contexte")
	public String afficherContexte() {
		return "/contexte/index";
	}
	
	@GetMapping("/connexion")
	public String connexion(
			@ModelAttribute("membre") Membre membre,
			@RequestParam(name = "email",
						required = false,
						defaultValue = "jtrillard@campus-eni.fr") String email						
			) {
		Membre membreLocal = contexteService.charger(email);
		if(membreLocal!=null) {
			membre.setId(membreLocal.getId());
			membre.setPrenom(membreLocal.getPrenom());
			membre.setNom(membreLocal.getNom());
			membre.setPseudo(membreLocal.getPseudo());
			membre.setAdmin(membreLocal.isAdmin());
			
		}else {
			membre.setId(null);
			membre.setPrenom(null);
			membre.setNom(null);
			membre.setPseudo(null);	
			membre.setAdmin(false);
		}
		System.err.println(membre);
		return "redirect:/films";
	}
	
	@GetMapping("/deconnexion")
	public String deconnexion(SessionStatus status) {
		status.setComplete();
		return "redirect:/films";
	}
	
}
