package com.assignment.chartJs.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.assignment.chartJs.entity.Student;
import com.assignment.chartJs.repository.LectureRepository;
import com.assignment.chartJs.repository.ScoreRepository;
import com.assignment.chartJs.repository.StudentRepository;

@Service
public class ChartJsService {
	
	@Autowired
	private final StudentRepository studentRepository;
	
	@Autowired
    public ChartJsService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    
//    public List<Student[]> getStudentsByLevel(byte level) {
//    	System.out.println("안찍힘");
//    	System.err.println("안찍힘");
//        return studentRepository.getStudentsByLevel(level);
//    }
	
	@GetMapping("/students")
	public List<Student> selectStu() {
		List<Student> stu = studentRepository.findAll();
		return stu;
	}
	
	
//	public void testGetStudentByGrade() {
//        List<Object[]> resultList = studentRepository.getStudentsByLevel((byte) 10);
//        System.out.println("출력 안됨");
//        for(Object[] row : resultList) {
//        	
//        }
//    }
	 
}
