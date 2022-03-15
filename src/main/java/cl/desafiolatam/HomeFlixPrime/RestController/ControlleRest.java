package cl.desafiolatam.HomeFlixPrime.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import cl.desafiolatam.HomeFlixPrime.Model.FilmCategory;
import cl.desafiolatam.HomeFlixPrime.Service.FilmCategoryService;


@RestController
@RequestMapping("/api/v1/filmCategory")
public class ControlleRest {

	@Autowired
	private FilmCategoryService filmCategoryService;
	
	@GetMapping("/{id}/{title}")
	@ResponseStatus(HttpStatus.OK)
	public List<FilmCategory> findByCategoryAndTitle(@PathVariable Long id,@PathVariable String title) {
		return filmCategoryService.findByCategoryAndTitle(id, title);
	}

	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<FilmCategory> findAll(){
		return filmCategoryService.findAll();
	}
	
	
}
