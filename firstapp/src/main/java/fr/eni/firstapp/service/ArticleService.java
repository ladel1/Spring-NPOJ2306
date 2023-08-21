package fr.eni.firstapp.service;

import java.util.List;

import fr.eni.firstapp.repository.ArticleRepository;

public class ArticleService {

	private ArticleRepository articleRepository;
	
	public ArticleService(ArticleRepository articleRepository) {
		this.articleRepository = articleRepository;
	}
	
	public List<String> allArticles(){
		return articleRepository.getArticles();
	}
	
}
