package main.entities;


import java.util.Map;

public class Student {
    private String studentId;
    private Map<Course, Integer> score;

    public Student(String studentId, Map<Course, Integer> score){
        this.studentId = studentId;
        this.score = score;
    }

    public String getStudentId() {
        return studentId;
    }

    public Map<Course, Integer> getScore() {
        return score;
    }
}
