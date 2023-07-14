package main.factories;

import main.entities.Course;
import main.view.ShowRequest;

import java.util.EnumMap;
import java.util.Map;

public class CoursesScoreGenerator {

    public static Map<Course, Integer> generateScores(String id){
        Map<Course, Integer> scores = new EnumMap<>(Course.class);
        for(Course course : Course.values()){
            int score = ShowRequest.RequestScore(id, course);
            scores.put(course, score);
        }
        return scores;
    }
}
