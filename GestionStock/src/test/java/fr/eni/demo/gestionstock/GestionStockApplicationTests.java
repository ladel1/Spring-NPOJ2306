package fr.eni.demo.gestionstock;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import fr.eni.demo.gestionstock.repository.ProduitRepository;

@SpringBootTest
class GestionStockApplicationTests {

	@Autowired
	private ProduitRepository produitRepository;
	
	@Test
	void testRepo() {
		System.out.println(produitRepository.findAllProduits());
	}
	
	
	@Test
	void contextLoads() {
	}

}
