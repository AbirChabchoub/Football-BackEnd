package com.example.demo.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="team")
public class Team {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column(nullable=false)
	private String team_name;
	private int number_players;
	
	
	/*@OneToMany
    private List<Player> ListPlayers;
	@ManyToOne
    private Matche match;*/
	
	/*@ManyToOne
  private Entraineur entraineur;*/
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTeam_name() {
		return team_name;
	}
	public void setTeam_name(String team_name) {
		this.team_name = team_name;
	}
	
	
	
	public int getNumber_players() {
		return number_players;
	}
	public void setNumber_players(int number_players) {
		this.number_players = number_players;
	}
	
	
	
	
	
}
