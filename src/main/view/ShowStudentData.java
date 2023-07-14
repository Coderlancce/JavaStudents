package main.view;

import main.entities.Course;
import main.entities.Student;

import java.util.Map;

public class ShowStudentData {
    public static void detailsStudent(Student student){
        GenerateText.generate("--------------------------------\n");
        GenerateText.generate("[" + student.getStudentId() + "] Student's Score Status\n");
        StringBuilder result = new StringBuilder();
        Map<Course, Integer> scores = student.getScore();
        for (Map.Entry<Course, Integer> entry : scores.entrySet()){
            Course course = entry.getKey();
            Integer score = entry.getValue();
            result.append(course.getNameCourse());
            result.append(" ");
            result.append(score);
            result.append(", ");
        }
        if (result.length() > 0) {
            result.setLength(result.length() - 2);
        }
        GenerateText.generate(String.valueOf(result) + "\n");
    }
}
