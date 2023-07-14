package main.entities;


import java.util.Map;

public class Student {
    private String studentId;
    private Map<Course, Integer> score;

    private double average;

    public Student(String studentId, Map<Course, Integer> score, double average){
        this.studentId = studentId;
        this.score = score;
        this.average = average;
    }

    public String getStudentId() {
        return studentId;
    }

    public Map<Course, Integer> getScore() {
        return score;
    }

    public double getAverage(){
        return average;
    }
}
