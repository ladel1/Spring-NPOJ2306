package fr.eni.demo.gestionstock.repository;

import java.util.List;

import fr.eni.demo.gestionstock.entity.Categorie;
import fr.eni.demo.gestionstock.entity.Produit;

public interface ProduitRepository {
	List<Produit> findAllProduits();
	Produit findProduitById(long id);
	List<Categorie> findAllCategories();
	Categorie findCategorieById(long id);
	void saveProduit(Produit produit);
	void saveCategorie(Categorie categorie);	
}
