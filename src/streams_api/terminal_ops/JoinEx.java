package streams_api.terminal_ops;

import data.Student;
import data.StudentDatabase;

import java.util.stream.Collectors;

public class JoinEx {

    public static String joining_1() {
        return StudentDatabase.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(Collectors.joining());
    }

    public static String joining_2() {
        return StudentDatabase.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(Collectors.joining(" "));
    }

    public static String joining_3() {
        return StudentDatabase.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(Collectors.joining(" , ", "names: [ ", " ]"));
    }

    public static void main(String[] args) {
        System.out.println(joining_1());
        System.out.println(joining_2());
        System.out.println(joining_3());
    }
}
