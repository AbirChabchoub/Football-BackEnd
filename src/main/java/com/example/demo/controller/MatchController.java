package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.MatchRepository;
import com.example.demo.models.Matche;

@RestController
@RequestMapping(path = "/matches")
public class MatchController {
@Autowired MatchRepository matchDao;
	
	@PostMapping(value= "/AddMatch", consumes = "application/json")
	public Matche register(@RequestBody Matche matche) {
	return matchDao.save(matche); }
	
	

	@GetMapping("/getAllMatches")
	public  List<Matche> players() {
	
		return matchDao.findAll();
	}
	
	@GetMapping("/quantity")
    int getQuantityMatches() {
        return matchDao.getQuantityOfMatches();
    }
	
	
	//players can have the same name so the output will be a list of player that have the same name
	@GetMapping("/matchByTeamOne/{name}")
	 List<Matche> getMatchByTeamOne(@PathVariable String name) {
        return matchDao.findMatchByTeamOne(name);
    }
	
	
	@GetMapping("/matchByTeamTwo/{name}")
	 List<Matche> getMatchByTeamTwo(@PathVariable String name) {
       return matchDao.findMatchByTeamTwo(name);
   }
	
	@DeleteMapping("/delete/{id}")
    public ResponseEntity deleteTask(@PathVariable Long id){
        boolean exist = matchDao.existsById(id);
        if(exist){
        	matchDao.deleteById(id);
            return new ResponseEntity<>("player is deleted !", HttpStatus.OK);
        }
        return new ResponseEntity<>("player does not exist", HttpStatus.BAD_REQUEST);
    }
	
	
	
	@PutMapping("/updateMatchByTeamOne/{id}")
	int updateMatchByTeamOne(@PathVariable Long id,@RequestBody Matche matche) {
		return  matchDao.updateMatchByTeamOne(id,matche.getTeam_one());
	}
	
	@PutMapping("/updateMatchByTeamTwo/{id}")
	int updateMatchByTeamTwo(@PathVariable Long id,@RequestBody Matche matche) {
		return  matchDao.updateMatchByTeamTwo(id,matche.getTeam_two());
	}
	
	
	@GetMapping("/matchById/{id}")
	 Matche getMatchByID(@PathVariable Long id) {
       return matchDao.getMatchById(id);
   }
	
	
}
