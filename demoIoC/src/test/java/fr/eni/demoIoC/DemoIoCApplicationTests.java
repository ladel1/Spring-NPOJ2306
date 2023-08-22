package fr.eni.demoIoC;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import fr.eni.demoIoC.service.ArtisteService;

@SpringBootTest
class DemoIoCApplicationTests {
	// IoC
	@Autowired
	private ArtisteService artisteService;

	@Test
	void testService() {
		System.out.println(artisteService.tousLesArtistes());
	}
	@Test
	void contextLoads() {
	}

}
