package fr.eni.tp.Filmotheque.bll.mock;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import fr.eni.tp.Filmotheque.bll.FilmService;
import fr.eni.tp.Filmotheque.bo.Avis;
import fr.eni.tp.Filmotheque.bo.Film;
import fr.eni.tp.Filmotheque.bo.Genre;
import fr.eni.tp.Filmotheque.bo.Membre;
import fr.eni.tp.Filmotheque.bo.Participant;

@Service
@Profile("dev")
public class FilmServiceBouchon implements FilmService {
	// Attributs statiques pour gérer les valeurs à afficher et simuler les données
	// en base
	private static List<Film> lstFilms = new ArrayList<>();
	private static List<Genre> lstGenres = new ArrayList<>();
	private static List<Participant> lstParticipants = new ArrayList<>();
	private static Long indexFilms = 1L;

	// Représente la table en base de données des genres des films
	private static final String[] genres = { "Animation", "Science-fiction", "Documentaire", "Action", "Comédie",
			"Drame" };

	public FilmServiceBouchon() {
		simulationCoucheDALetDB();
	}

	@Override
	public List<Film> consulterFilms() {
		return lstFilms;
	}

	/**
	 * @return film si id correspond
	 * @return null si inconnu
	 */
	@Override
	public Film consulterFilmParId(Long id) {
		return lstFilms.stream().filter(item -> item.getId() == id).findAny().orElse(null);
	}

	@Override
	public List<Genre> consulterGenres() {
		return lstGenres;
	}

	@Override
	public List<Participant> consulterParticipants() {
		return lstParticipants;
	}

	@Override
	public Genre consulterGenreParId(Long id) {
		return lstGenres.stream().filter(item -> item.getId() == id).findAny().orElse(null);
	}

	/**
	 * @return participant si id correspond
	 * @return null si inconnu
	 */
	@Override
	public Participant consulterParticipantParId(Long id) {
		return lstParticipants.stream().filter(item -> item.getId() == id).findAny().orElse(null);
	}

	@Override
	public void creerFilm(Film film) {
		// Sauvegarde du film
		film.setId(indexFilms++);
		lstFilms.add(film);
	}

	/**
	 * Cette méthode permet de simuler le stockage en base de données et la remontée
	 * d'information
	 */
	public void simulationCoucheDALetDB() {
		// Création de la liste des genres
		for (long index = 0; index < genres.length; index++) {
			lstGenres.add(new Genre((long)index + 1, genres[(int) index]));
		}

		// Création de la liste des participants aux films (acteurs et réalisateurs)
		// 3 réalisateurs dont 1 pour 2 films et 1 réalisateurs qui est aussi un acteur
		lstParticipants.add(new Participant(1L, "Spielberg", "Steven"));
		lstParticipants.add(new Participant(2L, "Cronenberg", "David"));
		Participant dany = new Participant(3L, "Boon", "Dany");
		dany.setRealisateur(true);
		dany.setActeur(true);;
		lstParticipants.add(dany);

		// 2 acteurs par film et l'un d'eux dans 2 films
		lstParticipants.add(new Participant(4L, "Attenborough", "Richard"));
		lstParticipants.add(new Participant(5L, "Goldblum", "Jeff"));
		lstParticipants.add(new Participant(6L, "Davis", "Geena"));
		lstParticipants.add(new Participant(7l, "Rylance", "Mark"));
		lstParticipants.add(new Participant(8l, "Barnhill", "Ruby"));
		lstParticipants.add(new Participant(9L, "Merad", "Kad"));

		// Création de la liste de films
		// 4 films
		Film jurassicPark = new Film(indexFilms++, "Jurassic Park", 1993, 128,
				"Le film raconte l'histoire d'un milliardaire et son équipe de généticiens parvenant à ramener à la vie des dinosaures grâce au clonage.");
		jurassicPark.setGenre(lstGenres.get(1));
		jurassicPark.setRealisateur(consulterParticipantParId(1L));
		// Associer les acteurs
		jurassicPark.getActeurs().add(consulterParticipantParId(4L));
		jurassicPark.getActeurs().add(consulterParticipantParId(5L));
		lstFilms.add(jurassicPark);

		Film theFly = new Film(indexFilms++, "The Fly", 1986, 95,
				"Il s'agit de l'adaptation cinématographique de la nouvelle éponyme de l'auteur George Langelaan.");
		theFly.setGenre(lstGenres.get(1));
		theFly.setRealisateur(consulterParticipantParId(2L));
		// Associer les acteurs
		theFly.getActeurs().add(consulterParticipantParId(5L));
		theFly.getActeurs().add(consulterParticipantParId(6L));
		lstFilms.add(theFly);

		Film theBFG = new Film(indexFilms++, "The BFG", 2016, 117,
				"Le Bon Gros Géant est un géant bien différent des autres habitants du Pays des Géants.");
		theBFG.setGenre(lstGenres.get(4));
		theBFG.setRealisateur(consulterParticipantParId(1L));
		// Associer les acteurs
		theBFG.getActeurs().add(consulterParticipantParId(7L));
		theBFG.getActeurs().add(consulterParticipantParId(8L));
		lstFilms.add(theBFG);

		Film bienvenueChezLesChtis = new Film(indexFilms++, "Bienvenue chez les Ch'tis", 2008, 106,
				"Philippe Abrams est directeur de la poste de Salon-de-Provence. Il est marié à Julie, dont le caractère dépressif lui rend la vie impossible. Pour lui faire plaisir, Philippe fraude afin d'obtenir une mutation sur la Côte d'Azur. Mais il est démasqué: il sera muté à Bergues, petite ville du Nord.");
		bienvenueChezLesChtis.setGenre(lstGenres.get(4));
		bienvenueChezLesChtis.setRealisateur(consulterParticipantParId(3L));
		// Associer les acteurs
		bienvenueChezLesChtis.getActeurs().add(consulterParticipantParId(3L));
		bienvenueChezLesChtis.getActeurs().add(consulterParticipantParId(9L));
		lstFilms.add(bienvenueChezLesChtis);

		// Création d'un membre et un avis
		Membre membre1 = new Membre(1L, "Baille", "Anne-Lise", "abaille@campus-eni.fr", null);
		Avis avis = new Avis(1L, 4, "On rit du début à la fin", membre1);
		bienvenueChezLesChtis.getAvis().add(avis);
	}
}
