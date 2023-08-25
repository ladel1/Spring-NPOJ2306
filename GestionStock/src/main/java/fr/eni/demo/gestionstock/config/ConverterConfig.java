package fr.eni.demo.gestionstock.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import fr.eni.demo.gestionstock.converter.StringToCategorie;

@Configuration
public class ConverterConfig implements WebMvcConfigurer {

	@Autowired
	private StringToCategorie stringToCategorie;
	
	@Override
	public void addFormatters(FormatterRegistry registry) {
		registry.addConverter(stringToCategorie);
	}
	
}
