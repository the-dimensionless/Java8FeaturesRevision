package functional_interfaces;

import data.Student;
import data.StudentDatabase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionEx {
    static BiFunction<List<Student>, Predicate<Student>, Map<String, Double>> biFn =
            ((listOfStudents, studentPredicate) -> {
                Map<String, Double> gradeMap = new HashMap<>();
                listOfStudents.forEach((student -> {
                    if(studentPredicate.test(student)) {
                        gradeMap.put(student.getName(), student.getGpa());
                    }
                }));
                return gradeMap;
            });

    public static void main(String[] args) {
        System.out.println(biFn.apply(StudentDatabase.getAllStudents(), PredicateStudentEx.p2));
        System.out.println(biFn.apply(StudentDatabase.getAllStudents(), PredicateStudentEx.p1));
    }
}
