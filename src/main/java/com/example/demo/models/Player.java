package com.example.demo.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


//@Entity pour dire que cette classe doit etre un tableau dans la BD
@Entity 
public class Player {
	//@id pour dire que le champ id est la clé primaire
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)//generated value yaani généré automatiquement
	private Long id;
	@Column(nullable=false)
	private String player_name;
	@Column(nullable=false)
	private int player_age;
	@Column(nullable=false)
	private int player_number;
	private String player_poste;
	
	
	//constructeur avec paramétres
	public Player(Long id, String player_name,int player_age,int player_number,String player_poste) {
		super();
		this.id = id;
		this.player_name = player_name;
		this.player_age=player_age;
		this.player_poste=player_poste;
	}
	//constructeur sans paramétres
public Player() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPlayer_name() {
		return player_name;
	}

	public void setPlayer_name(String player_name) {
		this.player_name = player_name;
	}
	public String getPlayer_poste() {
		return player_poste;
	}
	public void setPlayer_poste(String player_poste) {
		this.player_poste = player_poste;
	}
	public int getPlayer_number() {
		return player_number;
	}
	public void setPlayer_number(int player_number) {
		this.player_number = player_number;
	}
	public int getPlayer_age() {
		return player_age;
	}
	public void setPlayer_age(int player_age) {
		this.player_age = player_age;
	}
	
	/*@ManyToOne
    private Team team;
	
	@ManyToOne
    private Matche match;*/

}
