package com.example.demo.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


import com.example.demo.dao.PlayerRepository;
import com.example.demo.models.Player;




@RestController //bech n9oulou li houwa controller
@RequestMapping(path = "/api") //url fel postman lezm yebda b /apiw baad esem méthode li theb tedemha 
//exp localhost/api/AddPlayer
public class PlayerController {
	@Autowired PlayerRepository playerDao;
//@Autowired : dependency injection : séparer les classes pour avoir une architecture plus souple et facilite les tests
	
	
	@PostMapping(value= "/AddPlayer", consumes = "application/json")//fel value="/add.." nektbou url mtaa méthode post
	public Player register(@RequestBody Player player) {
	return playerDao.save(player); }
	
	

	@GetMapping("/getAllPlayers")
	public  List<Player> players() {
		return playerDao.findAll();
	}
	
	@GetMapping("/quantity")
    int getQuantityPlayer() {
        return playerDao.getQuantityOfPlayer();
    }
	
	
	
	//players can have the same name so the output will be a list of player that have the same name
	@GetMapping("/playerByName/{name}")
	 List<Player> getPlayerByName(@PathVariable String name) {
        return playerDao.findPlayerByName(name);
    }
	
	
	
	
	@DeleteMapping("/delete/{id}")
    public ResponseEntity deleteTask(@PathVariable Long id){
        boolean exist = playerDao.existsById(id);
        if(exist){
        	playerDao.deleteById(id);
            return new ResponseEntity<>("player is deleted !", HttpStatus.OK);
        }
        return new ResponseEntity<>("player does not exist", HttpStatus.BAD_REQUEST);
    }
	
	
	
	@PutMapping("/updatePlayer/{id}")
	int updatePlayer(@PathVariable Long id,@RequestBody Player player) {
		return  playerDao.updateplayer(id,player.getPlayer_name());
	}
	
	
	
	
	@GetMapping("/playerById/{id}")
	 Player getPlayerByID(@PathVariable Long id) {
       return playerDao.getPlayerById(id);
   }
	

	
	
}