package streams_api.terminal_ops;

import data.Student;
import data.StudentDatabase;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByEx2 {
    public static void main(String[] args) {
        grouping_1();
    }

    public static void grouping_1() {
        // Two level grouping
        Map<Integer, Map<String, List<Student>>> collect = StudentDatabase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel,
                        Collectors.groupingBy(s -> s.getGpa() > 3 ? "Good" : "Bad")));
        System.out.println(collect);
    }

    public static void grouping_2() {
        // Two level grouping
    }
}
