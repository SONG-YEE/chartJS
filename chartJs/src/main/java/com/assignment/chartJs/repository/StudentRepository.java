package com.assignment.chartJs.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.chartJs.entity.Student;
import com.assignment.chartJs.repository.StudentRepository;
import com.assignment.chartJs.dto.StudentDTO;

@Service
public class ChartJsService {

	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
    public ChartJsService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
	
	
	public List<Object[]> getStudentsByLevel(byte level) {

		List<Object[]> students = studentRepository.getStudentsByLevel(level);
//		List<StudentDTO> studentDTOs = new ArrayList<>();
		
		for (Object[] student : students) {
			System.out.println(student[0]);
			System.out.println(student[1]);
			System.out.println(student[2]);
			System.out.println(student[3]);
			System.out.println(student[4]);
			System.out.println(student[5]);
//			Long seq = (Long) student[0];
//			String name = (String) student[1];
//			String gender = (String) student[2];
//			Byte studentLevel = (Byte) student[3];
//			String track = (String) student[4];
//			String title = (String) student[5];
//			Integer value = (Integer) student[6];
//			StudentDTO studentDTO = new StudentDTO(seq, name, gender, studentLevel, track, title, value);
//			studentDTOs.add(studentDTO);
		}
		
		List<Object[]> result = students;
		
		return result;
		
	}

}
