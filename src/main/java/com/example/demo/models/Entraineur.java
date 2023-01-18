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
@Table(name="entraineur")
public class Entraineur {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column(nullable=false)
	private String ent_name;
	private int exp_years;
	
	/*@OneToMany
	   private List<Team> ListTeams;*/
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEnt_name() {
		return ent_name;
	}
	public void setEnt_name(String ent_name) {
		this.ent_name = ent_name;
	}
	public int getExp_years() {
		return exp_years;
	}
	public void setExp_years(int exp_years) {
		this.exp_years = exp_years;
	}
	
	
}
