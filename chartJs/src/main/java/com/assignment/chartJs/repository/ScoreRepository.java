package com.assignment.chartJs.repository;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.assignment.chartJs.dto.ScoreDTO;
import com.assignment.chartJs.dto.StudentDTO;
import com.assignment.chartJs.entity.Score;

@Repository
public interface ScoreRepository extends JpaRepository<Score, Integer>{
	
	@Query(value = "SELECT s.track, FLOOR(AVG(sc.value)) " +
	   		   	   "FROM Score sc " +
	   		   	   "JOIN Student s ON s.seq = sc.student " +
	   		   	   "WHERE s.level = :level " +
	   		   	   "GROUP BY s.track", nativeQuery = true)
	public List<Object[]> getAvgByLevel(@Param("level") byte level);

	
	default List<ScoreDTO> getAvgByLevels(byte level) {
	    List<Object[]> records = getAvgByLevel(level);
	    List<ScoreDTO> scoreDTOs = new ArrayList<>();
	    for (Object[] record : records) {
	        Byte track = (Byte) record[0];
	        Byte value = (Byte) record[1];
	        ScoreDTO scoreDTO = new ScoreDTO(track, value);
	        scoreDTOs.add(scoreDTO);
	    }
	    return scoreDTOs;
	}
}
