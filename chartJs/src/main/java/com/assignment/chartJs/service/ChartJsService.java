package com.assignment.chartJs.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    
    public List<Object[]> getStudentsByLevel(byte level) {
        return studentRepository.getStudentsByLevel(level);
    }
    
    
}
