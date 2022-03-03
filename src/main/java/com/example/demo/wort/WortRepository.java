package com.example.demo.wort;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface WortRepository extends JpaRepository<Wort, Long>{

//	@Query("SELECT * FROM wortschatz_table")
//	List<Wort> findeAlleWoerter();
	
}
