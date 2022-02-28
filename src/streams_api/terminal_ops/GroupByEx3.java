package streams_api.terminal_ops;

import data.Student;
import data.StudentDatabase;

import java.util.*;
import java.util.stream.Collectors;

public class GroupByEx3 {
    public static void main(String[] args) {
        grouping_1();

        groupWithAggregate();
    }

    public static void grouping_1() {
        // key, type of collection, output type of value
        LinkedHashMap<String, Set<Student>> collect = StudentDatabase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(
                        Student::getName,
                        LinkedHashMap::new,
                        Collectors.toSet()
                ));
        System.out.println(collect);

    }

    public static void groupWithAggregate() {
        StudentDatabase.getAllStudents().stream().collect(Collectors.groupingBy(
                Student::getGradeLevel,
                Collectors.collectingAndThen(
                        Collectors.maxBy(Comparator.comparing(Student::getGpa)),
                        Optional::get
                )
        ));
    }
}
