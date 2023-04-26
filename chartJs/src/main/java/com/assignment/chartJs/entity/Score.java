package com.assignment.chartJs.entity;
import javax.persistence.*;

import lombok.*;


@Builder
@Getter
@Setter
@ToString
@Entity(name = "Score")
public class Score {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="seq")
	private int seq;

	@Column(name="value")
    private byte value;

	@Column(name="student")
    private int student;
    
	@Column(name="lecture")
    private int lecture;

}
