package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.models.Player;
//role interface : ndéfiniw toutes les méthodes
public interface PlayerRepository extends JpaRepository<Player,Long>//player esem classe li teb3a repo 
                                                                   //w long type clé primaire
{
	
	@Query(value ="SELECT count(*) FROM DS.player", nativeQuery = true)
	int getQuantityOfPlayer();
	
	@Query(value ="SELECT * FROM DS.player WHERE  player_name=?1", nativeQuery = true)
	 List<Player> findPlayerByName(  @Param("player_name")  String name);

	@Query(value ="Delete * FROM DS.player WHERE  id=?1", nativeQuery = true)
	boolean deletePlayer( @Param("id") Long id);
	
	
	
	@Modifying
    @Transactional
	@Query(value ="UPDATE DS.player  SET player_name =?2 WHERE id=?1", nativeQuery = true)
	int updateplayer(Long id,String name);
	
	@Query(value ="SELECT * FROM DS.player WHERE  id=?1", nativeQuery = true)
	Player getPlayerById(@Param("id") Long id);
	
	
}