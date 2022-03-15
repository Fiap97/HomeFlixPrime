package cl.desafiolatam.HomeFlixPrime.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.desafiolatam.HomeFlixPrime.Model.Film;
import cl.desafiolatam.HomeFlixPrime.Repository.FilmRepository;

@Service
public class FilmServiceImpl implements FilmService{

	@Autowired
	FilmRepository filmRepository;
	
	
	@Override
	public Film findById(Long id) {
		return filmRepository.getById(id);
	}

	@Override
	public List<Film> findAll() {
		return filmRepository.findAll();
	}

}
