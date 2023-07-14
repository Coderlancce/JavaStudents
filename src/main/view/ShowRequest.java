package main.view;

import main.entities.Course;
import main.inputs.InputNumber;

import java.util.Map;

public class ShowRequest{
    public static int RequestScore(String id, Course course){
        GenerateText.generate(id + " Student's " + course.getNameCourse() + " Score : ");
        return InputNumber.getNumber();
    }
}
