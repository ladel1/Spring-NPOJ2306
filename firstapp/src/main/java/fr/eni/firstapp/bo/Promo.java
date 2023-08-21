package fr.eni.firstapp.bo;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class Promo {

	private Integer id;
	private String nom;
	private List<Etudiant> etudiants = new ArrayList<Etudiant>();
	
	public void ajouterEtudiant(Etudiant etudiant) {
		etudiants.add(etudiant);
	}
	
}
