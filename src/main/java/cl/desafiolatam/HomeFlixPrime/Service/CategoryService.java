package cl.desafiolatam.HomeFlixPrime.Service;

import java.util.List;

import cl.desafiolatam.HomeFlixPrime.Model.Category;

public interface CategoryService {


	public Category findById(Long id);
	public List<Category> findAll(); 
	
}
