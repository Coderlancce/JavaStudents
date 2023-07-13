package main.inputs;

import main.entities.Course;
import main.inputs.UserInput;

import java.util.Scanner;

public class ScoreInput implements UserInput {
    private Course course;
    private String id;

    public ScoreInput(Course course, String id) {
        this.course = course;
        this.id = id;
    }

    @Override
    public int getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(id + " Student's " + course.nameCourse + " Score: ");
        return scanner.nextInt();
    }
}
