package com.assignment.chartJs.entity;
import javax.persistence.*;

import lombok.*;


@Builder
@Data
@Entity
public class Lecture {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

    private String title;

    private String subject;

}
