package streams_api.terminal_ops;

import data.Student;
import data.StudentDatabase;

import java.util.stream.Collectors;

public class SumAvgEx {
    public static void main(String[] args) {
        Double collect = StudentDatabase.getAllStudents()
                .stream()
                .collect(Collectors.summingDouble(Student::getGpa));
        System.out.println(collect);

        Double avg = StudentDatabase.getAllStudents()
                .stream()
                .collect(Collectors.averagingDouble(Student::getGpa));
        System.out.println(avg);
    }
}
