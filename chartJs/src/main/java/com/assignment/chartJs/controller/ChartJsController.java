package com.assignment.chartJs.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.chartJs.entity.Student;
import com.assignment.chartJs.repository.StudentRepository;
import com.assignment.chartJs.service.ChartJsService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("/")
public class ChartJsController {
	
	@Autowired
	private ChartJsService chartJsService;
	
	@Autowired
	public ChartJsController(ChartJsService chartJsService) {
      this.chartJsService = chartJsService;
	}
	
	@Autowired
	private StudentRepository studentRepository;
	
//	@GetMapping
//	public String chartView() {
//		return "index";
//	}
	
//	@GetMapping("/students/{level}")
//	public List<Object[]> getStudents(@PathVariable byte level) {
//		return chartJsService.getStudentsByLevel(level);
//	}
	

//	@GetMapping(value = "/students/{level}", produces = "application/json")
//	public List<Object[]> getStudents(@PathVariable byte level) {
//	    return chartJsService.getStudentsByLevel(level);
//	}
	
	@GetMapping("/students")
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }
	
//	public String getStudents(Model model) {
//		List<Object[]> students10 = chartJsService.getStudentsByLevel((byte)10);
//		List<Object[]> students11 = chartJsService.getStudentsByLevel((byte)11);
//		List<Object[]> students12 = chartJsService.getStudentsByLevel((byte)12);
//        model.addAttribute("students11", students11);
//        model.addAttribute("students12", students12);
//		return "index";
//	}
	
//	@GetMapping("/students/{level}")
//	public Map<String, List<Object[]>> getStudents(@PathVariable byte level) {
//		return (Map<String, List<Object[]>>) chartJsService.getStudentsByLevel(level);
//	}

}
