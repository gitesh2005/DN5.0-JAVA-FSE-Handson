package WEEK1.DesignPattern.MVCPatternExample;


public class StudentController {

    private Student student;
    private StudentView studentView;

    public StudentController(Student student, StudentView studentView) {
        this.student = student;
        this.studentView = studentView;
    }

    public void setStudentName(String name) {
        student.setName(name);
    }

    public void setStudentId(int id) {
        student.setId(id);
    }

    public void setStudentGrade(String grade) {
        student.setGrade(grade);
    }

    public void updateView() {
        studentView.displayStudentDetails(
                student.getName(),
                student.getId(),
                student.getGrade()
        );
    }
}