package main.view;

import main.calculators.AverageCalculator;
import main.calculators.RankCalculator;
import main.entities.Course;
import main.entities.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class ShowDataStudent {
    public void showDetailsStudent(Student student){
        System.out.println("-------------------------------------------");
        System.out.println("[" + student.getStudentId() + "] Student's Score Status");

        Map<Course, Integer> scores = student.getScore();
        StringBuilder output = new StringBuilder();
        for(Map.Entry<Course, Integer> entry: scores.entrySet()){
            output.append(entry.getKey().getNameCourse()).append(" ").append(entry.getValue()).append(", ");
        }
        output.setLength(output.length() - 2); // Remove the last ", "

        System.out.println(output);

        System.out.println("-------------------------------------------");
    }

    public AverageCalculator showDataStudentAvrAndRank(Student student){

        // Implement singleton
        AverageListSingleton averageListSingleton = AverageListSingleton.getInstance();
        List<AverageCalculator> average = averageListSingleton.getAverage();
        // Implement Calculator
        AverageCalculator averageCalculator = new AverageCalculator();
        averageCalculator.calculatorAverage(student);
        //Implement Rank
        RankCalculator rankCalculator = new RankCalculator();
        rankCalculator.calculatorRank(average, averageCalculator);

        System.out.println(String.format(Locale.US, "Avg. : %.02f, Rank : %d", averageCalculator.getAverage(), rankCalculator.getRank()));
        System.out.println("-------------------------------------------");
        return averageCalculator;
    }

    public void showAllStudents(Map<Student, AverageCalculator> studentAverages) {
        // Convert the entries to a list and sort it by average (in descending order)
        List<Map.Entry<Student, AverageCalculator>> entries = new ArrayList<>(studentAverages.entrySet());
        entries.sort((e1, e2) -> Double.compare(e2.getValue().getAverage(), e1.getValue().getAverage()));

        // Print the students in the sorted order
        for (Map.Entry<Student, AverageCalculator> entry : entries) {
            Student student = entry.getKey();
            AverageCalculator averageCalculator = entry.getValue();
            RankCalculator rankCalculator = new RankCalculator();
            rankCalculator.calculatorRank(AverageListSingleton.getInstance().getAverage(), averageCalculator);
            System.out.println(String.format(Locale.US, "%s : => Avg. : %.2f, Rank : %d", student.getStudentId(), averageCalculator.getAverage(), rankCalculator.getRank()));
        }
        System.out.println("========================================");
    }

    public void showClassAverages(Map<Course, List<Integer>> classScores) {
        for (Course course : Course.values()) {
            List<Integer> scores = classScores.get(course);
            double average = scores.stream().mapToInt(Integer::intValue).average().orElse(0.0);
            System.out.printf(String.format(Locale.US,"%s Class Avg. : %.2f\n", course.getNameCourse(), average));
        }
        System.out.println("========================================");
    }
}
