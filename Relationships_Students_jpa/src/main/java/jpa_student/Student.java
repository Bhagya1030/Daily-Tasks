package jpa_student;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name="student")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int student_id;
	private String student_name;
	@ManyToMany
	@JoinTable(name="student_course" ,
	joinColumns=@JoinColumn(name="student_id"),
	inverseJoinColumns=@JoinColumn(name="course_id"))
	private List<Course> courses=new ArrayList<>();
	
	//Create an empty constructor
	
	public Student() {
		
	}
    public Student(String student_name) {
		this.student_name=student_name;
		this.courses=new ArrayList<>();
	}
    //Add a method to enroll in the course
    public void Enroll(Course course) {
    	courses.add(course);
    	course.getStudents().add(this);
    	
    }
	//Create Getters and Setters by right click and select source then generate them 
    
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public List<Course> getCourses() {
		return courses;
	}
	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
    
}
