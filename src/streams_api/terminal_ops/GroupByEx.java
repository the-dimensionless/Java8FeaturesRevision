package streams_api.terminal_ops;

import data.Student;
import data.StudentDatabase;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByEx {
    public static void main(String[] args) {
        groupByGender();
        groupByGpa(); // customized grouping label key
    }

    public static void groupByGender() {
        Map<String, List<Student>> studentMap = StudentDatabase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(
                        Student::getGender
                ));
        System.out.println("Student Map: "+studentMap);
    }

    public static void groupByGpa() {
        Map<String, List<Student>> collect = StudentDatabase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(
                        student -> student.getGpa() > 3 ?
                                "OUTSTANDING" : "AVERAGE"
                ));
        System.out.println("Student Map: "+collect);
    }
}
