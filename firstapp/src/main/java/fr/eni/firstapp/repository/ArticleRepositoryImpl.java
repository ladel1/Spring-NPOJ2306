package fr.eni.firstapp.repository;

import java.util.List;

public class ArticleRepositoryImpl implements ArticleRepository {

	@Override
	public List<String> getArticles(){
		return List.of(
				"Samsung S21",
				"Iphone 12",
				"Dell PC",
				"HP pc",
				"PS5",
				"Xbox Series X"
				);
	}
	
}
