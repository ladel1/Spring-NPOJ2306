package fr.eni.tp.Filmotheque.bo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public abstract class Personne {

	private Long id;
	private String nom;
	private String prenom;
	
	@Override
	public String toString() {
		return "%s %s (%d)".formatted(nom,prenom,id);
	}
	
}
