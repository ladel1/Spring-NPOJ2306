package fr.eni.demo.gestionstock.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.eni.demo.gestionstock.entity.Categorie;
import fr.eni.demo.gestionstock.entity.Produit;
import fr.eni.demo.gestionstock.repository.ProduitRepository;

@Service
public class ProduitServiceImpl implements ProduitService {

	@Autowired
	private ProduitRepository produitRepository;
	
	@Override
	public List<Produit> consulterProduits() {
		// Logique ou calcules
		return produitRepository.findAllProduits();
	}

	@Override
	public List<Categorie> consulterCategories() {		
		return produitRepository.findAllCategories();
	}

	@Override
	public Produit consulterProduitParId(long id) {
		return produitRepository.findProduitById(id);
	}

	@Override
	public Categorie consulterCategorieParId(long id) {
		return produitRepository.findCategorieById(id);
	}

	@Override
	public void sauvegarderProduit(Produit produit) {
		produitRepository.saveProduit(produit);
	}

	@Override
	public void sauvegraderCategorie(Categorie categorie) {
		produitRepository.saveCategorie(categorie);
	}

	
	
}
