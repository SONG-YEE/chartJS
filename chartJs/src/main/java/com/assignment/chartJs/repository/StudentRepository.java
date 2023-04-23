package com.assignment.chartJs.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.assignment.chartJs.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{
	
//		@Query("SELECT name, gender, level, track, Lecture.title, Score.value " +
//					    "FROM Student " +
//					    "INNER JOIN Score ON Student.seq = Score.student " +
//					    "INNER JOIN Lecture ON Score.lecture = Lecture.seq " +
//					    "WHERE level = :level " +
//					    "GROUP BY name, gender, level, track, Lecture.title, Score.value " +
//					    "ORDER BY level, track")
//			List<Object[]> getStudentsByLevel(@Param("level") byte level);
	@Query(value = "SELECT s.name, s.gender, s.level, s.track, l.title, sc.value " +
            "FROM student s " +
            "INNER JOIN score sc ON s.seq = sc.student " +
            "INNER JOIN lecture l ON sc.lecture = l.seq " +
            "WHERE s.level = :level " +
            "GROUP BY s.name, s.gender, s.level, s.track, l.title, sc.value " +
            "ORDER BY s.level, s.track", nativeQuery = true)
List<Object[]> getStudentsByLevel(@Param("level") byte level);
}

//@Repository
//public interface StudentRepository extends JpaRepository<Student, Integer>{
//	
//	List<Object[]> findDistinctByNameAndGenderAndLevelAndTrackOrderByLevelAscTrackAscScoreValueAscLectureTitleAsc(
//            byte level
//    );
//	
//}
