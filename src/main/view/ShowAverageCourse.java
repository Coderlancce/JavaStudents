package main.view;

import main.entities.Course;
import main.entities.Student;
import main.factories.AverageGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class ShowAverageCourse {
    public static void showCourseAverage(List<Student> students){
        for (Course course : Course.values()) {
            List<Integer> scores = new ArrayList<>();
            for (Student student : students) {
                Map<Course, Integer> studentScores = student.getScore();
                if (studentScores.containsKey(course)) {
                    scores.add(studentScores.get(course));
                }
            }

            double averageScore = AverageGenerator.averageCalculator(scores);
            GenerateText.generate(String.format(Locale.US,"%s Class Avg: %.2f\n" ,course.getNameCourse(), averageScore));
        }
        GenerateText.generate("====================================\n");
    }
}
