package fr.eni.demo.gestionstock.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import fr.eni.demo.gestionstock.service.ProduitService;

@Controller
@RequestMapping("/produits")
public class ProduitController {
	
	@Autowired
	private ProduitService produitService;
	
	@GetMapping
	public String tousLesProduits(Model model) {
		// recuperer la liste de produits et le transmettre à la vue
		model.addAttribute("produits", produitService.consulterProduits());		
		return "produits/list";
	}
	
	@GetMapping("/{id:[0-9]+}")
	public String details(@PathVariable long id, Model model) {
		model.addAttribute("produit", produitService.consulterProduitParId(id));
		return "produits/details";
	}


}
