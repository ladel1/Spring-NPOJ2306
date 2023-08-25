package fr.eni.demo.gestionstock.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import fr.eni.demo.gestionstock.entity.Categorie;
import fr.eni.demo.gestionstock.service.ProduitService;

@Component
public class StringToCategorie implements Converter<String, Categorie> {

	@Autowired
	private ProduitService produitService;
	
	@Override
	public Categorie convert(String source) {
		System.err.println("****** StringToCategorie ******");
		long id = Long.parseLong(source);		
		return produitService.consulterCategorieParId(id);
	}

}
