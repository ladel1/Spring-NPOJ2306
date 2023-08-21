package fr.eni.demoIoC.repository;

import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import com.github.javafaker.Faker;

import fr.eni.demoIoC.entity.Artiste;

@Repository
//@Primary
@Profile("test")
public class ArtisteRepositoryMock implements ArtisteRepository {
	private Faker faker = new Faker();
	private List<Artiste> lstArtistes = List.of(
			new Artiste(faker.internet().uuid(), faker.artist().name(), faker.music().genre()),
			new Artiste(faker.internet().uuid(), faker.artist().name(), faker.music().genre()),
			new Artiste(faker.internet().uuid(), faker.artist().name(), faker.music().genre()),
			new Artiste(faker.internet().uuid(), faker.artist().name(), faker.music().genre()),
			new Artiste(faker.internet().uuid(), faker.artist().name(), faker.music().genre()),
			new Artiste(faker.internet().uuid(), faker.artist().name(), faker.music().genre())			
			);
	
	
	
	@Override
	public List<Artiste> allArtistes() {		
		return lstArtistes;
	}

	@Override
	public Artiste findArtiste(String id) {
		for (Artiste artiste : lstArtistes) {
			if(artiste.getId().equals(id)) {
				return artiste;
			}
		}
		return null;
	}

	@Override
	public void saveArtiste(Artiste artiste) {
		lstArtistes.add(artiste);
	}

}
