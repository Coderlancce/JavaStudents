package main.factories;

import main.entities.Course;

import java.util.Scanner;

public class GenerateScore {

    public Integer getScoreFromUser(Course course, String id){
        Scanner scanner = new Scanner(System.in);
        System.out.print(id + " Student's " + course.nameCourse + " Score: ");
        return scanner.nextInt();
    }

}
