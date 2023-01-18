package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.models.Matche;

public interface MatchRepository extends JpaRepository<Matche,Long>{
	
	@Query(value ="SELECT count(*) FROM DS.match", nativeQuery = true)
	int getQuantityOfMatches();
	
	@Query(value ="SELECT * FROM DS.match WHERE  team_one=?1", nativeQuery = true)
	 List<Matche> findMatchByTeamOne(  @Param("team_one")  String name);
	
	@Query(value ="SELECT * FROM DS.match WHERE  team_two=?1", nativeQuery = true)
	 List<Matche> findMatchByTeamTwo(  @Param("team_two")  String name);


	@Query(value ="Delete * FROM DS.match WHERE  id=?1", nativeQuery = true)
	boolean deleteMatch( @Param("id") Long id);
	
	
	@Modifying
    @Transactional
	@Query(value ="UPDATE DS.match  SET team_one =?2 WHERE id=?1", nativeQuery = true)
	int updateMatchByTeamOne(Long id,String name);
	
	@Modifying
    @Transactional
	@Query(value ="UPDATE DS.match  SET team_two =?2 WHERE id=?1", nativeQuery = true)
	int updateMatchByTeamTwo(Long id,String name);
	
	@Query(value ="SELECT * FROM DS.match WHERE  id=?1", nativeQuery = true)
	Matche getMatchById(@Param("id") Long id);


	
	

}
