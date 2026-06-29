public class StudentView {

    public void displayStudentDetails(Student student) {
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student ID: " + student.getId());
        System.out.println("Grade: " + student.getGrade());
    }
}