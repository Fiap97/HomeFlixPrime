package cl.desafiolatam.HomeFlixPrime.Model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="film_category")
@IdClass(FilmCategory.class)
public class FilmCategory implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@ManyToOne
	@JoinColumn(name="film_id",referencedColumnName = "film_id")
	private Film film;
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@ManyToOne
	@JoinColumn(name="category_id",referencedColumnName = "category_id")
	private Category category;
	private Timestamp last_update;
	
}
