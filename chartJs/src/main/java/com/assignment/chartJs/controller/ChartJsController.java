package com.assignment.chartJs.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.chartJs.service.ChartJsService;

@RestController
public class ChartJsController {
	
	private ChartJsService chartJsService;
	
	@GetMapping("/index")
	public String chartView() {
		return "index";
	}

}
