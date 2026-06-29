public class MVCPatternExample {

    public static void main(String[] args) {

        Student student = new Student("Jothi", "101", "A");

        StudentView view = new StudentView();

        StudentController controller = new StudentController(student, view);

        controller.updateView();

        controller.updateStudent("Jothieshvaran", "A+");

        controller.updateView();
    }
}