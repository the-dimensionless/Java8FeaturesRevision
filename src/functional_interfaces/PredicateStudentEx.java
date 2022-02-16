package functional_interfaces;

import data.Student;
import data.StudentDatabase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentEx {

    static List<Student> list = StudentDatabase.getAllStudents();

    static Predicate<Student> p1 = (s) -> s.getGradeLevel() > 2;
    static Predicate<Student> p2 = (s) -> s.getGpa() > 3.5;

    public static void filterStudentsByGradeLevel() {
        list.forEach((student) -> {
            if (p1.test(student)) {
                System.out.println(student);
            }
        });
    };

    public static void filterStudentsByGpa() {
        list.forEach((student) -> {
            if (p2.test(student)) {
                System.out.println(student);
            }
        });
    };

    public static void filterStudents() {
        list.forEach((student) -> {
            if (p1.or(p2).test(student)) {
                System.out.println(student);
            }
        });
    };

    public static void main(String[] args) {
        System.out.println("Filtered by Grade level =>");
        filterStudentsByGradeLevel();
        System.out.println("Filtered by Gpa =>");
        filterStudentsByGpa();
        System.out.println("Filtered by either =>");
        filterStudents();
    }
}
