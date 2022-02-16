package functional_interfaces;

import data.Student;
import data.StudentDatabase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionStudentEx {
    static Function<List<Student>, Map<String, Double>> studentFunction = (student -> {
        Map<String, Double> studentGradeMap = new HashMap<>();
        student.forEach((s) -> {
                 studentGradeMap.put(s.getName(), s.getGpa());
        });
        return studentGradeMap;
    });

    public static void main(String[] args) {
        System.out.println(studentFunction.apply(StudentDatabase.getAllStudents()));
    }

}
