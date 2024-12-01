package question04;

public class InstitutionManagementApp {

    public static void main(String[] args) {
        Course cs101 = new ConcreteCourse("CS101", "Introduction to Computer Science");
        Course ma101 = new ConcreteCourse("MA101", "Calculus I");
        Course ph101 = new ConcreteCourse("PH101", "Physics I");

        Student student1 = new Student();
        student1.setID(1);
        student1.setName("Alice Johnson");
        student1.EnrollCourse(cs101);
        student1.EnrollCourse(ma101);

        Student student2 = new Student();
        student2.setID(2);
        student2.setName("Bob Smith");
        student2.EnrollCourse(cs101);
        student2.EnrollCourse(ph101);

        Teacher teacher1 = new Teacher();
        teacher1.setID(101);
        teacher1.setName("Dr. John Doe");
        teacher1.TeachCourse(cs101);
        teacher1.TeachCourse(ph101);

        Teacher teacher2 = new Teacher();
        teacher2.setID(102);
        teacher2.setName("Dr. Jane Smith");
        teacher2.TeachCourse(ma101);

        System.out.println("Student Details:");
        student1.DisplayDetails();
        System.out.println();
        student2.DisplayDetails();

        System.out.println("\nTeacher Details:");
        teacher1.DisplayDetails();
        System.out.println();
        teacher2.DisplayDetails();
    }
}
