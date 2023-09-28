package com.example5.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.HashSet;

@Entity
@Table(name="coursee")
public class Course 
{
	@Id
	   @GeneratedValue(strategy=GenerationType.IDENTITY)
	   @Column(name="course_id")
	   private int id;
	   
	   @Column(name="course_name")
	   private String courseName;
	   
	   @ManyToMany(mappedBy="courses")
	   private Set<Student> studentts=new HashSet<Student>();

	public Course(int id, String courseName, Set<Student> studentts) {
		super();
		this.id = id;
		this.courseName = courseName;
		this.studentts = studentts;
	}

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public Set<Student> getStudentts() {
		return studentts;
	}

	public void setStudentts(Set<Student> studentts) {
		this.studentts = studentts;
	}
	   
	   
	   
	   
	   
}
