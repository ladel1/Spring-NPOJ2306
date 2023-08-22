package fr.eni.demoIoC.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.github.javafaker.Faker;

@Configuration
public class JavaFakerConfiguration {

	@Bean
	Faker getFakerMock() {
		System.err.println("JavaFaker");
		return new Faker();
	}
	
}
