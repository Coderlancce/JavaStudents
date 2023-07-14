package main.factories;

import main.entities.Course;
import main.entities.Student;

import java.util.Map;

public class StudentsFactory{

    public Student factoryStudent(){
        String id = SortedIdGenerator.generateId();
        Map<Course, Integer> scores = CoursesScoreGenerator.generateScores(id);
        double average = AverageGenerator.averageCalculator(scores);
        Student student = new Student(id, scores, average);
        return student;
    }
}
