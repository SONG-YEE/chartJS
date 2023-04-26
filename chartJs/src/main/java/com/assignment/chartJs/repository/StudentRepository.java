package com.assignment.chartJs.repository;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.assignment.chartJs.dto.StudentDTO;
import com.assignment.chartJs.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{
	
		
	@Query(value = "SELECT s.name, s.gender, s.level, s.track, l.title, sc.value " +
            	   "FROM Student s " +
            	   "INNER JOIN Score sc ON s.seq = sc.student " +
            	   "INNER JOIN Lecture l ON sc.lecture = l.seq " +
            	   "WHERE s.level = :level " +
            	   "GROUP BY s.name, s.gender, s.level, s.track, l.title, sc.value " +
            	   "ORDER BY s.track", nativeQuery = true)
	public List<Object[]> getStudentsByLevel(@Param("level") byte level);
	
	
	default List<StudentDTO> getStudentsByLevels(byte level) {
	    List<Object[]> records = getStudentsByLevel(level);
	    List<StudentDTO> studentDTOs = new ArrayList<>();
	    for (Object[] record : records) {
	        Long seq = (Long) record[0];
	        String name = (String) record[1];
	        String gender = (String) record[2];
	        Byte studentLevel = (Byte) record[3];
	        String track = (String) record[4];
	        String title = (String) record[5];
	        Integer value = (Integer) record[6];
	        StudentDTO studentDTO = new StudentDTO(seq, name, gender, studentLevel, track, title, value);
	        studentDTOs.add(studentDTO);
	    }
	    return studentDTOs;
	}
}
