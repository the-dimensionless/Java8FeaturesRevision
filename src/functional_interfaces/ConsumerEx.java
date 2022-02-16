package functional_interfaces;

import data.Student;
import data.StudentDatabase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerEx {
    static List<Student> list = StudentDatabase.getAllStudents();

    static Consumer<Student> c1 = (student) -> System.out.println(student);
    static Consumer<Student> c2 = (student) -> System.out.print(student.getName());
    static Consumer<Student> c3 = (student) -> System.out.println(student.getActivities());

    public static void printName() {
        list.forEach(c1);
    }

    public static void printNamesAndActivites() {
        list.forEach(c1.andThen(c2)); // Consumer chaining
    }

    public static void printNamesAndActivitesConditional() {
        list.forEach((student -> {
            if (student.getGradeLevel() > 2 && student.getGpa() > 3) {
                c2.andThen(c3).accept(student);
            }
        }));
    }

    public static void main(String[] args) {
        Consumer<String> c1 =
                (input) -> System.out.println(input.toUpperCase());
        c1.accept("Java 8");

        // printName();
        // printName();
        // printNamesAndActivites();
        printNamesAndActivitesConditional();
    }
}
