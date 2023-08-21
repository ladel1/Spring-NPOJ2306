package fr.eni.firstapp;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import fr.eni.firstapp.bo.Etudiant;
import fr.eni.firstapp.bo.Promo;
import fr.eni.firstapp.repository.ArticleRepository;
import fr.eni.firstapp.repository.ArticleRepositoryImpl;
import fr.eni.firstapp.service.ArticleService;

@SpringBootTest
class FirstappApplicationTests {
	
//	@Test
//	void testPromoEtudiant() {
//		Promo p = new Promo(1, "NCDA", null);
//		Etudiant e = new Etudiant(1, "Gaelle", "Dupont", p);
//		Etudiant e1 = new Etudiant(1, "Eric", "Duval", p);		
//		//p.ajouterEtudiant(e);
//	}
	
	@Test
	void testArticles() {
		ArticleRepository ar = new ArticleRepositoryImpl();
		ArticleService as = new ArticleService(ar);
		System.out.println(as.allArticles());
	}
	
	
	
	@Test
	void contextLoads() {
	}


}
