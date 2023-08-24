package fr.eni.demo.gestionstock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
@SessionAttributes({"prenom"})
public class SessionController {

	
	@ModelAttribute
	String setPrenom(){
		return "Adel";
	}
	
	@GetMapping("/get-session")
	public @ResponseBody String index(@ModelAttribute String prenom) {
		return "Prénom: "+prenom;
	}
	
	@GetMapping("/set-http-session")
	public @ResponseBody String setSession(HttpServletRequest request) {
		HttpSession session = request.getSession(); 
		session.setAttribute("user", "pierre");
		return "ok";
	}
	
	@GetMapping("/get-http-session")
	public @ResponseBody String getSession(HttpServletRequest request) {
		HttpSession session = request.getSession(); 	
		session.invalidate();
		return "User: "+session.getAttribute("user");
	}
	
	@GetMapping("/invalidate-session")
	public @ResponseBody String invalidate(SessionStatus status) {
		status.setComplete();		
		return "U ";
	}
	
}
