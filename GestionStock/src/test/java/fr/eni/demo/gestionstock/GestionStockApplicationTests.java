package fr.eni.demo.gestionstock;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import fr.eni.demo.gestionstock.repository.ProduitRepository;
import fr.eni.demo.gestionstock.service.ProduitService;

@SpringBootTest
class GestionStockApplicationTests {

	@Autowired
	private ProduitRepository produitRepository;
	
	@Autowired
	private ProduitService produitService;
	
	@Test
	void testRepo() {
		System.err.println("********* Test Repo ************");
		System.out.println(produitRepository.findAllProduits());
	}
	@Test
	void testService() {
		System.err.println("********* Test Service ************");
		System.out.println(produitService.consulterCategories());
	}
	
	
	@Test
	void contextLoads() {
	}

}
