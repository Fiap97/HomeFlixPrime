package cl.desafiolatam.HomeFlixPrime.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.desafiolatam.HomeFlixPrime.Model.Category;


@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{

}
