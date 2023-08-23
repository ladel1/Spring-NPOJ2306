package fr.eni.demo.gestionstock.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class Produit {
	private Long id;
	private String reference;
	private String nom;
	private String description;
	private float prix;
	private Categorie categorie;
}
