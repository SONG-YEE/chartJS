package com.assignment.chartJs.entity;
import javax.persistence.*;

import lombok.*;


@Builder
@Getter
@Setter
@ToString
@Entity(name = "Student")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="seq")
	private int seq;

	@Column(name="name")
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(name="gender")
    private GenderEnum genderEnum;
    
    @Column(name="level")
    private byte level;
    
    @Column(name="track")
    private byte track;

    
	@Override
	public String toString() {
		return "Student [seq=" + seq + ", name=" + name + ", genderEnum=" + genderEnum + ", level=" + level + ", track="
				+ track + "]";
	}
    
    
    
    
    
}
