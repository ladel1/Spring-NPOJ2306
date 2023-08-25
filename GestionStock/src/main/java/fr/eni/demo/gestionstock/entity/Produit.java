package fr.eni.demo.gestionstock.entity;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class Produit {
	@NotNull
	private Long id;
	@NotBlank
	private String reference;
	
	@Size(min = 2,
		  max = 30	
			)
	private String nom;
	@Size(min = 0,max = 250)
	private String description;
	@Min(value=0)
	private float prix;
	private Categorie categorie;
}
