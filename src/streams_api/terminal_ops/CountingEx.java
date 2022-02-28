package streams_api.terminal_ops;

import data.StudentDatabase;

import java.util.stream.Collectors;

public class CountingEx {

    public static void main(String[] args) {
        System.out.println(count());
    }

    public static long count() {
        return StudentDatabase.getAllStudents()
                .stream()
                .filter(student -> student.getGpa() > 3)
                .collect(Collectors.counting());
    }
}
