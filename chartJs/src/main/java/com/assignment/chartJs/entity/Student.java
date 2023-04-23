package com.assignment.chartJs.entity;
import javax.persistence.*;

import lombok.*;


@Builder
@Data
@Entity
@Table(name="Student")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int seq;

    private String name;

    @Enumerated(EnumType.STRING)
    private GenderEnum genderEnum;
    
    private byte level;
    
    private byte track;
    
}
