package fr.eni.firstapp.bo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor
public class Etudiant {
	private Integer id;
	private String prenom;
	private String nom;
	private Promo promo;
	
	public Etudiant(Integer id, String prenom, String nom, Promo promo) {
		this.id = id;
		this.prenom = prenom;
		this.nom = nom;
		this.promo = promo;
		promo.ajouterEtudiant(this);
	}
	
	
}
