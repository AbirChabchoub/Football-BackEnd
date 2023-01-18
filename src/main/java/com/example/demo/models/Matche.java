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
@Table(name="matche")
public class Matche {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column(nullable=false)
	
	private String team_one;
	private String team_two;
	private int score_one;
	private int score_two;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTeam_one() {
		return team_one;
	}
	public void setTeam_one(String team_one) {
		this.team_one = team_one;
	}
	public String getTeam_two() {
		return team_two;
	}
	public void setTeam_two(String team_two) {
		this.team_two = team_two;
	}
	public int getScore_one() {
		return score_one;
	}
	public void setScore_one(int score_one) {
		this.score_one = score_one;
	}
	public int getScore_two() {
		return score_two;
	}
	public void setScore_two(int score_two) {
		this.score_two = score_two;
	}
	
	/*@OneToMany(mappedBy = "matche")
    private List<Player> Listplayers;
	
	@OneToMany(mappedBy = "matche")
    private List<Team> ListTeams;*/
	
}
