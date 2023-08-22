package fr.eni.tp.Filmotheque.bo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class Avis {
	private Long id;
	private int note;
	private String commentaire;
	
	private Membre membre;
	
}
