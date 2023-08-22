package fr.eni.tp.Filmotheque.bo;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Film {

	private Long id;
	private String titre;
	private int annee;
	private int duree;
	private String synopsis;
	
	// association
	private Participant realisateur;
	private List<Participant> acteurs = new ArrayList<Participant>();
	
	private Genre genre;
	
	private List<Avis> avis = new ArrayList<Avis>();
	
	public Film(Long id, String titre, int annee, int duree, String synopsis) {
		super();
		this.id = id;
		this.titre = titre;
		this.annee = annee;
		this.duree = duree;
		this.synopsis = synopsis;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Titre : %s[annee: %d,duree : %d minutes]\n".formatted(titre,annee,duree));
		sb.append("Synopsis : %s\n".formatted(synopsis));
		sb.append("Realisateur : %s\n".formatted(realisateur));
		sb.append("Acteurs : %s\n".formatted(acteurs) );
		sb.append("Genre : %s\n".formatted(genre));
		sb.append("Avis : %s\n".formatted(avis));
		
		return sb.toString();
	}




	
}
