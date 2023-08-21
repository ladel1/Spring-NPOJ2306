package fr.eni.demoIoC.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class Artiste {
	private String id;
	private String nom;
	private String style;		
}
