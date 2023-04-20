package com.assignment.chartJs.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.assignment.chartJs.entity.Lecture;
import com.assignment.chartJs.entity.Score;
import com.assignment.chartJs.entity.Student;

@Repository
public interface ScoreRepository extends JpaRepository<Score, Integer>{
	
	List<Score> findAll();

}
