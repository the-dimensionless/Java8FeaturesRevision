package data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentDatabase {

    public static List<Student> getAllStudents() {
        Student s1 = new Student("A1", 2, 3.6, "male", Arrays.asList("cricket", "basketball", "badminton"));
        Student s2 = new Student("A2", 3, 3.5, "female", Arrays.asList("tennis", "basketball", "volleyball"));
        Student s3 = new Student("A3", 4, 2.6, "male", Arrays.asList("cricket", "badminton", "polo"));
        Student s4 = new Student("A4", 3, 3.1, "female", Arrays.asList("tennis", "basketball", "badminton"));
        Student s5 = new Student("A5", 2, 4.0, "male", Arrays.asList("badminton", "tennis", "polo"));
        Student s6 = new Student("A6", 3, 2.1, "male", Arrays.asList("tennis", "basketball", "volleyball"));

        return new ArrayList<Student>(Arrays.asList(s1,s2,s3,s4,s5,s6));
    }
}
