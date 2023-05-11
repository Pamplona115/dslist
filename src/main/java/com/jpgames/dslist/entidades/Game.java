package com.jpgames.dslist.entidades;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "tb_game")
public class Game {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String title;
	@Column(name = "game_year")
	private Integer year;
	private String genre;
	
	private String platforms;
	private Double score;
	private String imgUrl;
	@Column(columnDefinition = "TEXT")
	private String shortDescription;
	@Column(columnDefinition = "TEXT")
	private String longDescription;
	
	public Game() {
	}
	
	
	public Game(Long id, String title, Integer year, String genre, String platforms, Double score, String imgUrl,
			String shortDescription, String longDescription) {
		super();
		this.id = id;
		this.title = title;
		this.year = year;
		this.genre = genre;
		this.platforms = platforms;
		this.score = score;
		this.imgUrl = imgUrl;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
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
	public void setTitle(String titulo) {
		this.title = titulo;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer ano) {
		this.year = ano;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genero) {
		this.genre = genero;
	}
	public String getPlatforms() {
		return platforms;
	}
	public void setPlatforms(String plataforma) {
		this.platforms = plataforma;
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
	public void setShortDescription(String shortDescrip) {
		this.shortDescription = shortDescrip;
	}
	public String getLongDescription() {
		return longDescription;
	}
	public void setLongDescription(String longDescrip) {
		this.longDescription = longDescrip;
	}
	public Double getScore() {
		return score;
	}
	public void setScore(Double score) {
		this.score = score;
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(score);
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
		return Objects.equals(score, other.score);
	}
	
}
