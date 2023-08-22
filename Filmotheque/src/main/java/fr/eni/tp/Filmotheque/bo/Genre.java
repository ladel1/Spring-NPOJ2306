package fr.eni.tp.Filmotheque.bo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Genre {
	private Long id;
	private String titre;
	
	@Override
	public String toString() {
		return "%s (%d)".formatted(titre,id);
	}
	
}
