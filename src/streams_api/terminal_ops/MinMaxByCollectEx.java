package streams_api.terminal_ops;

import data.Student;
import data.StudentDatabase;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

public class MinMaxByCollectEx {

    public static void main(String[] args) {
        System.out.println(min());
        System.out.println(max());
    }

    public static Optional<Student> min() {
        return StudentDatabase.getAllStudents()
                .stream()
                .collect(Collectors.minBy(
                        Comparator.comparing(Student::getGpa)
                ));
    }

    public static Optional<Student> max() {
        return StudentDatabase.getAllStudents()
                .stream()
                .collect(Collectors.maxBy(
                        Comparator.comparing(Student::getGpa)
                ));
    }
}
