package jpa_student;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Course {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String course_name;
	@ManyToMany(mappedBy="courses")
	private List<Student> students;
	//Create constructors
	public Course() {
		
	}
	public Course(String course_name) {
		this.course_name=course_name;
		this.students=new ArrayList<>();
	}
	//Add a student to the course
	public void addstudent(Student student) {
		students.add(student);
		student.getCourses().add(this);
	}
	
	//Create Getters and Setters
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCourse_name() {
		return course_name;
	}
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}

}
