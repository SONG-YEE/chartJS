package com.assignment.chartJs.entity;
import javax.persistence.*;

import lombok.*;


@Builder
@Getter
@Setter
@ToString
@Entity(name = "Lecture")
public class Lecture {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;

	@Column(name="title")
    private String title;

	@Column(name="subject")
    private String subject;

}
