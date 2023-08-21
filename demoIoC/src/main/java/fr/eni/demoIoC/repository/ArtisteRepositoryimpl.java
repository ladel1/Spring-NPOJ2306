package fr.eni.demoIoC.repository;

import java.util.List;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import fr.eni.demoIoC.entity.Artiste;

@Repository
@Profile("dev")
public class ArtisteRepositoryimpl implements ArtisteRepository {

	@Override
	public List<Artiste> allArtistes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Artiste findArtiste(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveArtiste(Artiste artiste) {
		// TODO Auto-generated method stub
		
	}

}
