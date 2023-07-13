package main;


import main.calculators.AverageCalculator;
import main.factories.IdGenerator;
import main.factories.StudentsFactory;
import main.factories.SortedIdGenerator;
import main.entities.Student;
import main.inputs.NumberStudents;
import main.view.ShowDataStudent;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Ask number of students
        NumberStudents numberStudents = new NumberStudents();
        // Save number
        int numStudents = numberStudents.getInput();
        // Generate ID for student
        IdGenerator idGenerator = new SortedIdGenerator();
        // Generate Score
        StudentsFactory studentsFactory = new StudentsFactory(idGenerator);
        // Assign the score to course
        Map<Student, AverageCalculator> studentAverages = new HashMap<>();
        for (int i = 0; i < numStudents; i++) {
            Student student = studentsFactory.buildStudentWithScores();
            // Present Information
            ShowDataStudent showDataStudent = new ShowDataStudent();
            showDataStudent.showDetailsStudent(student);
            AverageCalculator averageCalculator = showDataStudent.showDataStudentAvrAndRank(student);
            studentAverages.put(student, averageCalculator);
        }
        // Display all students sorted by average and rank
        ShowDataStudent showDataStudent = new ShowDataStudent();
        showDataStudent.showAllStudents(studentAverages);

        ShowDataStudent showDataScores = new ShowDataStudent();
        showDataScores.showClassAverages(studentsFactory.getClassScores());
    }
}
