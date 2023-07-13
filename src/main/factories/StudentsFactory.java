package main.factories;

import main.inputs.ScoreInput;
import main.inputs.UserInput;
import main.entities.Course;
import main.entities.Student;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

public class StudentsFactory{

    private final IdGenerator idGenerator;
    private Map<Course, List<Integer>> classScores = new EnumMap<>(Course.class);

    public StudentsFactory(IdGenerator idGenerator){
        this.idGenerator = idGenerator;
    }
    public Student buildStudentWithScores(){
        String id = idGenerator.idGenerator();
        Map<Course, Integer> scores = new EnumMap<>(Course.class);
        for(Course course : Course.values()){
            UserInput scoreInput = new ScoreInput(course, id);
            int score = scoreInput.getInput();
            scores.put(course, score);

            // Add the score to the class scores
            classScores.computeIfAbsent(course, k -> new ArrayList<>()).add(score);
        }
        return new Student(id, scores);
    }

    public Map<Course, List<Integer>> getClassScores() {
        return classScores;
    }
}
