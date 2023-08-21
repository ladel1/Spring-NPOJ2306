package fr.eni.demoIoC.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import fr.eni.demoIoC.entity.Artiste;
import fr.eni.demoIoC.repository.ArtisteRepository;

@Service
public class ArtisteService {

	@Autowired
	//@Qualifier("MOCK")
	private ArtisteRepository artisteRepository;
	
	public List<Artiste> tousLesArtistes(){
		return artisteRepository.allArtistes();
	}
	
	
	public Artiste unArtiste(String id) {
		return artisteRepository.findArtiste(id);
	}
	
	public void ajouterArtiste(Artiste artiste) {
		artisteRepository.saveArtiste(artiste);
	}
	
	
}
