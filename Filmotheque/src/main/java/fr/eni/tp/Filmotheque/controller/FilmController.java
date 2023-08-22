package fr.eni.tp.Filmotheque.controller;

import org.springframework.stereotype.Component;

import fr.eni.tp.Filmotheque.bll.FilmService;

@Component
public class FilmController {

	private FilmService filmService;
	
	public FilmController(FilmService filmService) {
		this.filmService = filmService;
	}
	
	public void afficherFilms() {
		System.out.println(filmService.consulterFilms());
	}
	
	public void afficherUnFilm(long id) {
		System.out.println(filmService.consulterFilmParId(id));
	}
	
}
