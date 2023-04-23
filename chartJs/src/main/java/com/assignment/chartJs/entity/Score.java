package com.assignment.chartJs.entity;
import javax.persistence.*;

import lombok.*;


@Builder
@Data
@Entity
@Table(name="Score")
public class Score {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int seq;

    private byte value;

    private int student;
    
    private int lecture;

}
