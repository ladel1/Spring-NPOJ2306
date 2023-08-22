package fr.eni.tp.Filmotheque.bll;

import java.util.List;

import fr.eni.tp.Filmotheque.bo.Film;
import fr.eni.tp.Filmotheque.bo.Genre;
import fr.eni.tp.Filmotheque.bo.Participant;

public interface FilmService {

	List<Film> consulterFilms();
	Film consulterFilmParId(Long id);
	List<Genre> consulterGenres();
	Genre consulterGenreParId(Long id);
	List<Participant> consulterParticipants();
	Participant consulterParticipantParId(Long id);
	void creerFilm(Film film);
	
}
