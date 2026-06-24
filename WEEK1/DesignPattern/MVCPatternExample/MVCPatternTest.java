package WEEK1.DesignPattern.MVCPatternExample;

public class MVCPatternTest {

    public static void main(String[] args) {

        Student student = new Student("Rahul", 101, "A");

        StudentView studentView = new StudentView();

        StudentController studentController =
                new StudentController(student, studentView);

        System.out.println("Initial Student Details:");
        studentController.updateView();

        System.out.println();

        studentController.setStudentName("Amit");
        studentController.setStudentGrade("A+");

        System.out.println("Updated Student Details:");
        studentController.updateView();
    }
}