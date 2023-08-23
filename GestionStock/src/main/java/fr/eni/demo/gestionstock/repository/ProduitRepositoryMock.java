package fr.eni.demo.gestionstock.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.github.javafaker.Faker;

import fr.eni.demo.gestionstock.entity.Categorie;
import fr.eni.demo.gestionstock.entity.Produit;

@Repository
public class ProduitRepositoryMock implements ProduitRepository {

	private List<Produit> lstproduits = new ArrayList<Produit>();
	private List<Categorie> lstCategories = new ArrayList<Categorie>() ;
	
	private Faker faker = new Faker();
	
	
	public ProduitRepositoryMock() {
		// init mock (Produit et Categorie)
		for (int i = 1; i < 20; i++) {
			Categorie cat = new Categorie(faker.number().randomNumber(),
										  faker.commerce().department());
			Produit prod = new Produit(faker.number().randomNumber(),
									   faker.code().isbn10(),
									   faker.commerce().productName(), 
									   faker.lorem().sentence(),
									   (float)faker.number().randomDouble(2, 10, 500),
									   cat
									   );
			lstproduits.add(prod);
			lstCategories.add(cat);
		}
	}
	
	
	@Override
	public List<Produit> findAllProduits() {
		return lstproduits;
	}

	@Override
	public Produit findProduitById(long id) {		
		for (Produit produit : lstproduits) {
			if(produit.getId()==id) return produit;
		}		
		return null;
	}

	@Override
	public List<Categorie> findAllCategories() {
		return lstCategories;
	}

	@Override
	public Categorie findCategorieById(long id) {
		for (Categorie categorie : lstCategories) {
			if(categorie.getId()==id) return categorie;
		}	
		return null;
	}

	@Override
	public void saveProduit(Produit produit) {
		lstproduits.add(produit);
	}

	@Override
	public void saveCategorie(Categorie categorie) {
		lstCategories.add(categorie);
	}

}
