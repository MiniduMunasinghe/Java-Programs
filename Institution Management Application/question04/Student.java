package question04;

import java.util.ArrayList;

public class Student extends Person {
	ArrayList<Course> enrolledCourses = new ArrayList<>();
	
	public Student (){
		super();
		this.enrolledCourses = new ArrayList<>();
	}

	public Student(ArrayList<Course> enrolledCourses) {
		super();
		this.enrolledCourses = enrolledCourses;
	}

	public Student(int ID, String name, ArrayList<Course> enrolledCourses) {
		super(ID, name);
		this.enrolledCourses = enrolledCourses;
	}

	public void EnrollCourse(Course c) {
		enrolledCourses.add(c);
	}
	
	public void DisplayDetails() {
		System.out.println("Student ID : "+getID());
		System.out.println("Student Name : "+getName());
		System.out.println("Student Courses : ");
		for (Course course:enrolledCourses) {
			course.DisplayCourseDetailes();
		}
	}
	
}
