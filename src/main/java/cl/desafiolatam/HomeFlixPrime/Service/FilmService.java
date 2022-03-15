package cl.desafiolatam.HomeFlixPrime.Service;

import java.util.List;

import cl.desafiolatam.HomeFlixPrime.Model.Film;


public interface FilmService {

	
	public Film findById(Long id);
	public List<Film> findAll(); 
}
