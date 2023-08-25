package fr.eni.tp.Filmotheque.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import fr.eni.tp.Filmotheque.bll.FilmService;
import fr.eni.tp.Filmotheque.bo.Film;
import fr.eni.tp.Filmotheque.bo.Genre;


@Controller
@RequestMapping("/films")
@SessionAttributes({"genres","membre"})
public class FilmController {

	private FilmService filmService;
		
	
	public FilmController(FilmService filmService) {
		this.filmService = filmService;
	}
	
	
	@ModelAttribute("genres")
	public List<Genre> initGenreAttribute(){
		return filmService.consulterGenres();
	}
	
	@GetMapping
	public String afficherFilms(Model model) {
		List<Film> films = filmService.consulterFilms();
		model.addAttribute("films", films);
		return "/films/index";
	}
	
	@GetMapping("/details")
	public String afficherUnFilm(@RequestParam(name = "id",required = true) long id,Model model) {
		Film film = filmService.consulterFilmParId(id);
		model.addAttribute("film", film);
		return "/films/details";
	}
	
	@GetMapping("/ajouter")
	public String ajouterFilmFormulaire() {
		return "/films/ajouter";
	}
	
}
