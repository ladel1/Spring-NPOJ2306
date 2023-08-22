package fr.eni.tp.Filmotheque.bo;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Participant extends Personne {

	//private boolean realisateurActeur;
	
	private boolean realisateur;
	private boolean acteur;
	
	public Participant() {
		super();		
	}

	public Participant(Long id, String nom, String prenom) {
		super(id, nom, prenom);		
	}
	
	@Override
	public String toString() {
		return "%s %s".formatted(super.toString(),(realisateur && acteur)?"- [Realisateur, Acteur]":"");
	}

}
