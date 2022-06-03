

public class Run {
    public static void main(String[] args) {

        StudentGenerator.getStudents();
        System.out.println();
        StudentService.checkFaculty(StudentGenerator.getStudents(), "Medicine");
        System.out.println();
        StudentService.checkFacultyAndGroup(StudentGenerator.getStudents(), "Law", 3);
        System.out.println();
        StudentService.checkBirthday(StudentGenerator.getStudents(), 1993);
        System.out.println();
        StudentService.checkGroup(StudentGenerator.getStudents(), 1);

    }
}
