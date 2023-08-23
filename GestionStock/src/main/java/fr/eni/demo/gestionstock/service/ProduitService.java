package fr.eni.demo.gestionstock.service;

import java.util.List;

import fr.eni.demo.gestionstock.entity.Categorie;
import fr.eni.demo.gestionstock.entity.Produit;

public interface ProduitService {

	List<Produit> consulterProduits();
	List<Categorie> consulterCategories();
	Produit consulterProduitParId(long id);
	Categorie consulterCategorieParId(long id);
	void sauvegarderProduit(Produit produit);
	void sauvegraderCategorie(Categorie categorie);
	
}
