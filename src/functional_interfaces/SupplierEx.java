package functional_interfaces;

import data.Student;
import data.StudentDatabase;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierEx {

    static Supplier<Student> supplier = () ->
            new Student("A1", 2, 3.6, "male", Arrays.asList("cricket", "basketball", "badminton"));

    static Supplier<List<Student>> ls = () -> StudentDatabase.getAllStudents();

    public static void main(String[] args) {
        System.out.println("Student is "+supplier.get());
        System.out.println("Students are "+ls.get());
    }
}
