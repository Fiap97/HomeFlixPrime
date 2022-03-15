package cl.desafiolatam.HomeFlixPrime.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.desafiolatam.HomeFlixPrime.Model.FilmCategory;
import cl.desafiolatam.HomeFlixPrime.Repository.FilmCategoryRepository;

@Service
public class FilmCategoryServiceImpl implements FilmCategoryService{

	@Autowired
	FilmCategoryRepository filmCategoryRepository;
	
	
	@Override
	public FilmCategory findById(Long id) {
		return filmCategoryRepository.findById(id).get();
	}

	@Override
	public List<cl.desafiolatam.HomeFlixPrime.Model.FilmCategory> findAll() {
		return filmCategoryRepository.findAll();
	}

	@Override
	public List<FilmCategory> findByCategoryAndTitle(Long id, String title) {
		return filmCategoryRepository.findByCategoryAndTitle(id, title);
	}


}
