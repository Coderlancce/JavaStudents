package main.entities;

public enum Course {
    JAVA("Java"), SQL("SQL"), MATH("Math"), ENGLISH("English");

    public String nameCourse;

    private Course(String nameCourse){
        this.nameCourse = nameCourse;
    }

    public String getNameCourse(){
        return nameCourse;
    }
}
