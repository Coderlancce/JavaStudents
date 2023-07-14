package main;


import main.factories.StudentsFactory;
import main.entities.Student;
import main.inputs.NumberStudents;
import main.storage.StudentsStorage;
import main.view.ShowAverageCourse;
import main.view.ShowAvgRank;
import main.view.ShowOrderRanks;
import main.view.ShowStudentData;

public class Main {
    public static void main(String[] args) {
        int numberStudents = NumberStudents.getNumber();
        for (int i = 0; i < numberStudents; i++) {
            StudentsFactory student = new StudentsFactory();
            Student createdStudent = student.factoryStudent();
            StudentsStorage.addStudent(createdStudent);
            ShowStudentData.detailsStudent(createdStudent);
            ShowAvgRank.showAvgRank(createdStudent);
        }
        ShowOrderRanks.showRanking(StudentsStorage.getStudents());
        ShowAverageCourse.showCourseAverage(StudentsStorage.getStudents());
    }
}
