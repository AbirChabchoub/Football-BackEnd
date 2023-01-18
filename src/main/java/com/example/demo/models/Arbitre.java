package com.example.demo.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="arbitre")
public class Arbitre {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column(nullable=false)
	private String arbitre_name;
	
	/*@OneToMany
    private List<Matche> ListMatches;*/
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getArbitre_name() {
		return arbitre_name;
	}
	public void setArbitre_name(String arbitre_name) {
		this.arbitre_name = arbitre_name;
	}
	
	
	
}
