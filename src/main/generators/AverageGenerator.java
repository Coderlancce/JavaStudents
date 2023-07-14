package main.generators;

import main.entities.Course;

import java.util.List;
import java.util.Map;

public class AverageGenerator {
    public static double averageCalculator(Map<Course, Integer> scores){
        double sum = 0;
        for (Integer score: scores.values()){
            sum += score;
        }
        return sum /= scores.size();
    }

    public static double averageCalculator(List<Integer> scores){
        double sum = 0;
        for (Integer score: scores){
            sum += score;
        }
        return sum /= scores.size();
    }
}
