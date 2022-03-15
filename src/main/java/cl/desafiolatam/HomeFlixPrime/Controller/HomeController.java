package cl.desafiolatam.HomeFlixPrime.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import cl.desafiolatam.HomeFlixPrime.Model.FilmCategory;
import cl.desafiolatam.HomeFlixPrime.Service.CategoryService;
import cl.desafiolatam.HomeFlixPrime.Service.FilmCategoryService;
import cl.desafiolatam.HomeFlixPrime.Model.Category;


@Controller
public class HomeController {

	@Autowired
	private CategoryService categoryService;
	@Autowired
	private FilmCategoryService filmCategoriaService;
	
	@GetMapping("/home")
	public ModelAndView home() {
		ModelAndView modelAndView = new ModelAndView("home");
		
		List<Category> categorias= categoryService.findAll();
		
		modelAndView.addObject("categorias",categorias);
		return modelAndView;
	}
	
	
	@GetMapping("/buscar")
	public ModelAndView buscar(Model model,@RequestParam("id_categoria") Long idCategoria, @RequestParam("palabra") String palabra){
		
		ModelAndView modelAndView = new ModelAndView("home");
		
		System.out.println("Categoria= "+idCategoria+"  "+"Tiulo= "+palabra);
		
		
		List<Category> categorias= categoryService.findAll();
		
		
		List<FilmCategory> filmCategorias = filmCategoriaService.findByCategoryAndTitle(idCategoria, palabra);
	
		 Category categoria = new Category();
		 
		for(Category cat : categorias) {
			if(cat.getCategory_id()==idCategoria) {
				categoria=cat;
			}
		}
		 
	
		modelAndView.addObject("filmCategorys",filmCategorias);
		modelAndView.addObject("categorias",categorias);
		modelAndView.addObject("categoria",categoria);


		
		return modelAndView;
	}
	
	
}
