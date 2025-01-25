package br.com.dslist.entities;


import java.util.Objects;

import jakarta.persistence.*;

/**
 * @author fsdney
 */

@Entity
@Table(name = "tb_game")
public class Game {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String title;
	private String genre;
	
	@Column(name = "game_year")//year é uma palavra reservada do sql , por isso editar o nome da tabela
	private Integer year;
	private String platforms;
	private String imgUrl;
	
	@Column(columnDefinition = "TEXT")// PARA EVITAR O ERRO DE SER MUITO LONGO, DAI O JPA RECEBE COMO UM CAMPO DE TEXTO AO INVES DE UM VARCHAR COM DEFINIÇÃO
	private String shortDescription;
	
	@Column(columnDefinition = "TEXT")// PARA EVITAR O ERRO DE SER MUITO LONGO, DAI O JPA RECEBE COMO UM CAMPO DE TEXTO AO INVES DE UM VARCHAR COM DEFINIÇÃO
	private String longDescription;
	private Double score;
	
	public Game() {
		
	}

	public Game(Long id, String title, String genre, Integer year, String platforms, String imgUrl,
			String shortDescription, String longDescription, Double score) {
		this.id = id;
		this.title = title;
		this.genre = genre;
		this.year = year;
		this.platforms = platforms;
		this.imgUrl = imgUrl;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
		this.score = score;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getPlatforms() {
		return platforms;
	}

	public void setPlatforms(String platforms) {
		this.platforms = platforms;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getLongDescription() {
		return longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Game other = (Game) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	

}
