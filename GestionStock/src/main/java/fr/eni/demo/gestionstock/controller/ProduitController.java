package fr.eni.demo.gestionstock.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import fr.eni.demo.gestionstock.entity.Categorie;
import fr.eni.demo.gestionstock.entity.Produit;
import fr.eni.demo.gestionstock.service.ProduitService;
import jakarta.validation.Valid;
import jakarta.websocket.server.PathParam;

@Controller
@RequestMapping("/produits")
@SessionAttributes({"categories"})
public class ProduitController {
	
	@Autowired
	private ProduitService produitService;
	
	@ModelAttribute("categories")
	public List<Categorie> initCategories(){
		return produitService.consulterCategories();
	}
	
	@GetMapping
	public String tousLesProduits(Model model) {
		// recuperer la liste de produits et le transmettre à la vue
		model.addAttribute("produits", produitService.consulterProduits());		
		return "produits/list";
	}
	
	@GetMapping("/details")
	public String details(@PathParam("id") long id, Model model) {
		model.addAttribute("produit", produitService.consulterProduitParId(id));
		model.addAttribute("isReadonly", true);
		return "produits/details";
	}
	
	
	@GetMapping("/ajouter")
	public String ajotuerForm(Model model ) {
		model.addAttribute("produit", new Produit() );
		return "produits/ajouter";
	}
	
	@PostMapping("/ajouter")
	public String ajouterTraitement(
			@Valid @ModelAttribute Produit produit,
	
			BindingResult br
			) {
		if(br.hasErrors()) {		
			return "produits/ajouter";
		}
		produitService.sauvegarderProduit(produit);
		return "redirect:/produits";
	}


}
