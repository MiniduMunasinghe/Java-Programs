package question04;

abstract class Course {
    String code;
    String courseName;

    public Course() {
        this.code = "";
        this.courseName = "";
    }

    public Course(String code, String courseName) {
        this.code = code;
        this.courseName = courseName;
    }

    public void DisplayCourseDetailes() {
        System.out.println("Course Code: " + code + ", Course Name: " + courseName);
    }
}
