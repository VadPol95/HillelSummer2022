/**
 * Метод checkFaculty - проверяет студентов по факультетам
 * Метод checkFacultyAndGroup - проверяет студентов по группе и факультету
 * Метод checkBirthday - проверяет студентов по году рождения
 * Метод checkGroup - проверяет студентов по группам
 */

public class StudentService {
    public static void checkFaculty(Student[] students, String faculty) {
        System.out.println("Students of medicine faculty " + faculty + ":");
        for (Student student : students) {
            if (student.getFaculty().equals(faculty)) {
                System.out.println(student);
            }
        }
        System.out.println();
    }

    public static void checkFacultyAndGroup(Student[] students, String faculty, int group) {
        System.out.println("Students of faculty " + faculty + ", group " + group + " :");
        for (Student student : students) {
            if (student.getFaculty().equals(faculty) && student.getGroup() == (group)) {
                System.out.println(student);
            }
        }
        System.out.println();
    }

    public static void checkBirthday(Student[] students, int birthday) {
        System.out.println("Students who was born after " + birthday + ":");
        for (Student student : students) {
            if (student.getBirthday() > birthday) {
                System.out.println(student);
            }
        }
        System.out.println();
    }

    public static void checkGroup(Student[] students, int group) {
        System.out.println("Students of the " + group + " group " + ":");
        for (Student student : students) {
            if (student.getGroup() == group) {
                System.out.println(student);
            }
        }
    }
}
