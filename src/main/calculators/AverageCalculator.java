package main.calculators;

import main.entities.Course;
import main.entities.Student;

import java.util.Map;

public class AverageCalculator implements Comparable<AverageCalculator>{

    private double average;
    public double calculatorAverage(Student student){
        Map<Course, Integer> scores = student.getScore();
        double sum = 0;
        for(Integer score: scores.values()){
            sum += score;
        }
        return this.average = sum / scores.size();
    }

    public double getAverage(){
        return average;
    }

    @Override
    public int compareTo(AverageCalculator other) {
        if (this.average < other.average) {
            return -1;
        } else if (this.average > other.average) {
            return 1;
        } else {
            return 0;
        }
    }
}
