package com.example.demo.wort;




import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface WortRepository extends JpaRepository<Wort, Long>{

//	@Query("SELECT * FROM wortschatz_table")
//	List<Wort> findeAlleWoerter();
	
	@Query(value = "SELECT * FROM wortschatz_table WHERE sprache = ?1", nativeQuery = true)
	List<Wort> findeAlleWoerterAusSprache(String sprache);
	
	@Query(value = "SELECT * FROM wortschatz_table WHERE (sprache = ?1 AND laenge = ?2)", nativeQuery = true)
	List<Wort> findeAlleWoerterAusSpracheMitWortlaenge(String sprache, int laenge);
	
	
}
