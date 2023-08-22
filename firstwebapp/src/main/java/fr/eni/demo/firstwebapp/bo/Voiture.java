package fr.eni.demo.firstwebapp.bo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class Voiture {
	private Long id;
	private String modele;
	private String marque;	
}
