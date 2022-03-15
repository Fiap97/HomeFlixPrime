package cl.desafiolatam.HomeFlixPrime.Model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name="film")
public class Film {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long film_id;
	private String title;
	private String description;
	private int release_year;
	private int language_id;
	private int original_language_id;
	private int rental_duration;
	private BigDecimal rental_rate;
	private int length;
	private BigDecimal replacement_cost;
	private String rating;
	private String special_features;
	private Timestamp last_update;
}
