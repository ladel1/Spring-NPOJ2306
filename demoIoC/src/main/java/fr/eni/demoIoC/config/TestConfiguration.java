package fr.eni.demoIoC.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfiguration {

	@Bean
	Fake getFake() {
		System.err.println("Je crée une instance Fake");
		return new Fake();
	}
	
}
