package cl.desafiolatam.HomeFlixPrime.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.desafiolatam.HomeFlixPrime.Model.Film;

@Repository
public interface FilmRepository extends JpaRepository<Film, Long>{

}
