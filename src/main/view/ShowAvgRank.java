package main.view;

import main.entities.Student;

import java.util.Locale;

public class ShowAvgRank {
    public static void showAvgRank(Student student){
        GenerateText.generate("--------------------------------\n");
        GenerateText.generate(String.format(Locale.US, "Avg : %.2f, Rank %d\n", student.getAverage(),
                GenerateRank.rank(student.getAverage())));
        GenerateText.generate("--------------------------------\n");
    }
}
