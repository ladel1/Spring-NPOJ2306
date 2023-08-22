package fr.eni.tp.Filmotheque.bo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class Membre extends Personne{

	private String pseudo;
	private String motDePasse;
	private boolean admin;
	
	public Membre(Long id, String nom, String prenom, String pseudo, String motDePasse) {
		super(id, nom, prenom);
		this.pseudo = pseudo;
		this.motDePasse = motDePasse;
	}
}
