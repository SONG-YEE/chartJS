package com.assignment.chartJs.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.chartJs.dto.ScoreDTO;
import com.assignment.chartJs.dto.StudentDTO;
import com.assignment.chartJs.repository.ScoreRepository;
import com.assignment.chartJs.repository.StudentRepository;

@Service
public class ChartJsService {

	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private ScoreRepository scoreRepository;
	
	@Autowired
    public ChartJsService(StudentRepository studentRepository, ScoreRepository scoreRepository) {
        this.studentRepository = studentRepository;
        this.scoreRepository = scoreRepository;
    }
	
	
//	public List<StudentDTO> getStudentsByLevel(byte level) {
//
//		List<Object[]> students = studentRepository.getStudentsByLevel(level);
//		List<StudentDTO> studentDTOs = new ArrayList<>();
//		
//		int count = 0;
//		for (Object[] student : students) {
//			System.out.println(student[0]);
//			System.out.println(student[1]);
//			System.out.println(student[2]);
//			System.out.println(student[3]);
//			System.out.println(student[4]);
//			System.out.println(student[5]);
//			
//			count++;
//			
//			int seq = (int) student[0];
//			String name = (String) student[1];
//			String gender = (String) student[2];
//			Byte studentLevel = (Byte) student[3];
//			Byte track = (Byte) student[4];
//			String title = (String) student[5];
//			Byte value = (Byte) student[6];
//			StudentDTO studentDTO = new StudentDTO(seq, name, gender, studentLevel, track, title, value);
//			studentDTOs.add(studentDTO);
//			
//			System.out.println(" ----------------배열사이즈-----------------> " + count);
//		}
//		
//		System.out.println("최종 배열 사이즈 : " + count);
//		
//		List<StudentDTO> result = studentDTOs;
//		
//		return result;
//		
//	}
	
	public List<Object[]> getStudentsByLevel(byte level) {
		
		List<Object[]> students = studentRepository.getStudentsByLevel(level);
		List<StudentDTO> studentDTOs = new ArrayList<>();
		
		int count = 0;
		for (Object[] student : students) {
			//System.out.println(student.toString());
			
			count++;
			
//			int seq = (int) student[0];
//			String name = (String) student[1];
//			String gender = (String) student[2];
//			Byte studentLevel = (Byte) student[3];
//			Byte track = (Byte) student[4];
//			String title = (String) student[5];
//			Byte value = (Byte) student[6];
//			StudentDTO studentDTO = new StudentDTO(seq, name, gender, studentLevel, track, title, value);
//			studentDTOs.add(studentDTO);
			
			//System.out.println(" ----------------배열사이즈-----------------> " + count);
		}
		
		System.out.println("최종 배열 사이즈 : " + count);
		
		List<Object[]> result = students;
		
		return result;
		
	}
	
	public List<Object[]> getAvg(byte level) {
		
		List<Object[]> averageScore = scoreRepository.getAvgByLevel(level);
		List<ScoreDTO> scoreDTOs = new ArrayList<>();
		
		int count = 0;
		for (Object[] sc : averageScore) {
			//System.out.println(sc.toString());
			
			count++;
			
			//System.out.println("평균점수 뽑아내는 배열 사이즈 : " + count);
		}
		
		System.out.println("최종 배열 사이즈 : " + count);
		
		List<Object[]> result = averageScore;
		
		return result;
	}

}
