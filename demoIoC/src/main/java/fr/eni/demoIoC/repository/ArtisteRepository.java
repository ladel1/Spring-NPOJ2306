package fr.eni.demoIoC.repository;

import java.util.List;

import fr.eni.demoIoC.entity.Artiste;

public interface ArtisteRepository {
	List<Artiste> allArtistes();
	Artiste findArtiste(String id);
	void saveArtiste(Artiste artiste);	
}
