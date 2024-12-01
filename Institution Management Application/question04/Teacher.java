package question04;

import java.util.ArrayList;

public class Teacher extends Person {
	ArrayList<Course> courseTaught = new ArrayList<>();
	
	public Teacher() {
		super();
		this.courseTaught = new ArrayList<>();
	}

	public Teacher(ArrayList<Course> courseTaught) {
		super();
		this.courseTaught = courseTaught;
	}

	public Teacher(int ID, String name, ArrayList<Course> courseTaught) {
		super(ID, name);
		this.courseTaught = courseTaught;
	}
	
	public void TeachCourse(Course c) {
		courseTaught.add(c);
	}
	
	public void DisplayDetails() {
        System.out.println("Teacher ID: " + getID());
        System.out.println("Teacher Name: " + getName());
        System.out.println("Courses Taught:");
        for (Course course : courseTaught) {
            course.DisplayCourseDetailes();
        }
    }
	
}
