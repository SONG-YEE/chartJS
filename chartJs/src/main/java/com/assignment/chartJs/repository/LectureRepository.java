package com.assignment.chartJs.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assignment.chartJs.entity.Lecture;

@Repository
public interface LectureRepository extends JpaRepository<Lecture, Integer>{
	
	List<Lecture> findAll();

}
