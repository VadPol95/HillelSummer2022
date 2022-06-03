

public class Run {
    public static void main(String[] args) {

        StudentGenerator.getStudents();
        StudentService.checkFaculty(StudentGenerator.getStudents(), "Medicine");
        StudentService.checkFacultyAndGroup(StudentGenerator.getStudents(), "Law", 3);
        StudentService.checkBirthday(StudentGenerator.getStudents(), 1993);
        StudentService.checkGroup(StudentGenerator.getStudents(), 1);

    }
}
