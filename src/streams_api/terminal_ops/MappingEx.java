package streams_api.terminal_ops;

import data.Student;
import data.StudentDatabase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MappingEx {
    public static void main(String[] args) {
        List<String> list = StudentDatabase.getAllStudents()
                .stream()
                .collect(Collectors.mapping(
                        Student::getName, Collectors.toList()
                ));
        System.out.println(list);

        Set<String> set = StudentDatabase.getAllStudents()
                .stream()
                .collect(Collectors.mapping(
                        Student::getName, Collectors.toSet()
                ));
        System.out.println(set);
    }
}
