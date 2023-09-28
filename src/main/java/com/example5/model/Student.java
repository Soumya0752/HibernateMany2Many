package com.example5.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.HashSet;
import javax.persistence.JoinColumn;

@Entity
@Table(name="students")
public class Student
{
	
   @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
   @Column(name="stu_id")
   private int id;
   
   @Column(name="stu_name")
   private String name;
   
   @ManyToMany
   @JoinTable(name="student_course",joinColumns=@JoinColumn(name="student_id"),
   inverseJoinColumns=@JoinColumn(name="course_id"))
   private Set<Course> courses=new HashSet<Course>();

public Student(int id, String name, Set<Course> courses) {
	super();
	this.id = id;
	this.name = name;
	this.courses = courses;
}

public Student() {
	super();
	// TODO Auto-generated constructor stub
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Set<Course> getCourses() {
	return courses;
}

public void setCourses(Set<Course> courses) {
	this.courses = courses;
}
   
  
}










