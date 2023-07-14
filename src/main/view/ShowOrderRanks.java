package main.view;

import main.entities.Student;
import main.generators.GenerateRank;
import main.generators.GenerateText;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

public class ShowOrderRanks {
    public static void showRanking(List<Student> students){
        Collections.sort(students, Comparator.comparingDouble(Student::getAverage).reversed());
        for (Student student : students) {
            GenerateText.generate(String.format(Locale.US,
                    "%s : => Avg : %.2f, Rank : %d\n",
                    student.getStudentId(), student.getAverage(), GenerateRank.rank(student.getAverage())));
        }
        GenerateText.generate("======================================\n");
    }
}
