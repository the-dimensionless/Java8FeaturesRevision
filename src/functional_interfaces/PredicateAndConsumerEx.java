package functional_interfaces;

import data.Student;
import data.StudentDatabase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerEx {

    Predicate<Student> p1 = (s) -> s.getGradeLevel() >= 2;
    Predicate<Student> p2 = (s) -> s.getGpa() >= 3.6;

    BiConsumer<String, List<String>> studentBiConsumer = (name, activities) ->
            System.out.println("Name: "+name+" , Activities: "+activities);

    Consumer<Student> studentConsumer = (student -> {
        if(p1.and(p2).test(student)) {
            studentBiConsumer.accept(student.getName(), student.getActivities());
        }
    });

    BiPredicate<Integer, Double> p3 = (grade, gpa) -> grade >= 2 && gpa >= 3.6;

    Consumer<Student> cbip = (student -> {
        if (p3.test(student.getGradeLevel(), student.getGpa())){
            studentBiConsumer.accept(student.getName(), student.getActivities());
        }
    });

    public void printNamesAndActivities(List<Student> list) {
        list.forEach(studentConsumer);
        list.forEach(cbip);
    }

    public static void main(String[] args) {
        List<Student> list = StudentDatabase.getAllStudents();
        new PredicateAndConsumerEx().printNamesAndActivities(list);
    }
}
