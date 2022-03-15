package cl.desafiolatam.HomeFlixPrime.Service;

import java.util.List;

import cl.desafiolatam.HomeFlixPrime.Model.FilmCategory;


public interface FilmCategoryService {

	public FilmCategory findById(Long id);
	public List<FilmCategory> findAll(); 
	public List<FilmCategory> findByCategoryAndTitle(Long id, String title);
	
	
}
