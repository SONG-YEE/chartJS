package com.assignment.chartJs.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.chartJs.dto.ScoreDTO;
import com.assignment.chartJs.dto.StudentDTO;
import com.assignment.chartJs.repository.StudentRepository;
import com.assignment.chartJs.service.ChartJsService;

@RestController
public class ChartJsController {

	@Autowired
	private ChartJsService chartJsService;
	
	@Autowired
	private StudentRepository studentRepository;
	
//	@GetMapping("/index")
//	public String chartView() {
//		return "index";
//	}
	
	@GetMapping("tabList/{level}")
	public List<StudentDTO> getStudentsByLevel(@PathVariable byte level) {
		
		return chartJsService.getStudentsByLevel(level);
		
	}
	
	@GetMapping("chart/{level}")
	public List<Object[]> getAvg(@PathVariable byte level) {
		
		return chartJsService.getAvg(level);
		
	}

	
//	@GetMapping("/hello")
//	public String getJson() {
//		List<Object[]> st = getStudentsByLevel((byte) 10);
//		
//		
//		for(Object[] s : st) {
//			
//			System.out.println("seq: " + st[0]);
//		    System.out.println("name: " + st[1]);
//		    System.out.println("gender: " + student[2]);
//		    System.out.println("level: " + student[3]);
//		    System.out.println("track: " + student[4]);
//		    System.out.println("title: " + student[5]);
//		    System.out.println("value: " + student[6]);
//		    
//		}
//		return 
//	}

}
