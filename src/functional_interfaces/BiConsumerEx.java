package functional_interfaces;

import data.Student;
import data.StudentDatabase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerEx {

    public static void nameAndActivities() {
        BiConsumer<String, List<String>> biConsumer = (name, activities) -> {
            System.out.println("Name: "+name+" Activites: "+activities);
        };
        List<Student> list = StudentDatabase.getAllStudents();
        list.forEach((student) -> biConsumer.accept(student.getName(), student.getActivities()));
    }

    public static void main(String[] args) {
        BiConsumer<String, String> biConsumer = (a, b) -> {
            System.out.println("a : "+a+" , b : "+b);
        };
        biConsumer.accept("java", "8");

        BiConsumer<Integer, Integer> biConsumer2 = (a, b) -> System.out.println(a*b);
        biConsumer2.accept(2, 3);

        BiConsumer<Integer, Integer> biConsumer3 = (a, b) -> System.out.println(a/b);

        biConsumer2.andThen(biConsumer3).accept(4, 2);

        nameAndActivities();
    }
}
