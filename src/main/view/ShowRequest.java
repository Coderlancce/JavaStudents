package main.view;

import main.entities.Course;
import main.generators.GenerateText;
import main.inputs.InputNumber;

public class ShowRequest{
    public static int RequestScore(String id, Course course){
        GenerateText.generate(id + " Student's " + course.getNameCourse() + " Score : ");
        return InputNumber.getNumber();
    }
}
