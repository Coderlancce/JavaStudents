package main.storage;

import main.entities.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentsStorage {
    private static List<Student> students  = new ArrayList<>();

    public static void addStudent(Student student){
        students.add(student);
    }

    public static List<Student> getStudents(){
        return students;
    }
}
