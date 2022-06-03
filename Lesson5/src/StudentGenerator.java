public class StudentGenerator {

    public static Student[] getStudents() {
        Student student1 = new Student(1, "Vadym", "Alekseevich", "Polyvianoi", 1995,
                "Pushkina 1", 123454234, "Medicine", 3, 2);
        Student student2 = new Student(2, "Artem", "Artemovich", "Artemov", 1996,
                "Pushkina 2", 123253328, "IT", 2, 1);
        Student student3 = new Student(3, "Vlad", "Vladovich", "Vladov", 1994,
                "Pushkina 3", 122335678, "Law", 1, 3);
        Student student4 = new Student(4, "Sviatoslav", "Sviatoslavovich", "Sviatoslavov", 1995,
                "Pushkina 4", 123454121, "IT", 2, 1);
        Student student5 = new Student(5, "Gennadiy", "Gennadievich", "Gennadievov", 1993,
                "Pushkina 5", 123451212, "Law", 1, 3);
        Student student6 = new Student(6, "Sergey", "Sergeevich", "Sergeev", 1996,
                "Pushkina 6", 123521252, "Medicine", 3, 2);
        Student student7 = new Student(7, "Petr", "Petrovich", "Petrov", 1995,
                "Pushkina 7", 123456789, "Law", 1, 3);
        Student student8 = new Student(8, "Katya", "Petrovna", "Petrova", 1994,
                "Pushkina 8", 123456788, "IT", 2, 1);
        Student student9 = new Student(9, "Polina", "Alekseevna", "Alekseeva", 1993,
                "Pushkina 9", 123456781, "Medicine", 3, 2);
        Student student10 = new Student(10, "Vasiliy", "Vasilievich", "Vasiliev", 1993,
                "Pushkina 10", 123456784, "IT", 2, 1);

            Student[] student = new Student[10];
            student[0] = student1;
            student[1] = student2;
            student[2] = student3;
            student[3] = student4;
            student[4] = student5;
            student[5] = student6;
            student[6] = student7;
            student[7] = student8;
            student[8] = student9;
            student[9] = student10;


        return student;
    }
}
