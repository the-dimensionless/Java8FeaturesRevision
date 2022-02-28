package streams_api.terminal_ops;

import data.Student;
import data.StudentDatabase;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PartitionByEx {
    // Kind of GroupBy()
    // Accepts a Predicate as an input
    // returns Map<K,V>
    // 2 versions
    public static void main(String[] args) {
        Predicate<Student> gpaPredicate = student -> student.getGpa() > 3;

        Map<Boolean, List<Student>> collect = StudentDatabase.getAllStudents().stream().collect(
                Collectors.partitioningBy(
                        gpaPredicate
                )
        );
        System.out.println(collect);


        Map<Boolean, Set<Student>> collect1 = StudentDatabase.getAllStudents().stream().collect(
                Collectors.partitioningBy(
                        gpaPredicate,
                        Collectors.toSet()
                )
        );
        System.out.println(collect1);
    }
}
