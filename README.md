# Student Score Manager

This project aims to manage student scores, ranking and class averages efficiently, following the principles of SOLID and other design patterns.

## Project Structure

The project follows a package-based structure, with each package named according to its responsibility.

### Packages

- main: Contains the Main class, where the program execution starts.
- main.input: Contains interfaces and classes related to user input.
- main.factory: Contains classes related to the creation of student and score objects.
- main.entity: Contains entity classes such as Student and Course.
- main.view: Contains classes for presenting information to the user.
- main.calculator: Contains classes for calculating averages and rankings.
- main.utils: Contains utility classes used throughout the project.

## Project Description

The project uses SOLID principles and design patterns such as Singleton and Factory to organize and structure the code. Here is a brief overview:
- The program asks the user to input the number of students in a class.
- For each student, the program asks the user to input scores for each course (Java, SQL, Math, English).
- After inputting all scores, the program displays individual scores, average score, and rank for each student.
- At the end, the program displays class average for each course.

## Key Classes & Interfaces

- UserInput: An interface for getting input from the user.
- NumberStudents, ScoreInput: Implementations of UserInput, for getting the number of students and their scores respectively.
- IdGenerator, SortedIdGenerator: For generating unique student IDs.
- StudentsFactory: A Factory class for creating student objects with scores.
- Student, Course: Entity classes representing Student and Course.
- ShowDataStudent, AverageListSingleton: For displaying student data and managing a singleton list of averages respectively.
- AverageCalculator, RankCalculator: For calculating averages and ranks.

## Future Improvements

In the future, the project could be expanded to:
- Include more detailed student information.
- Support more courses.
- Store data persistently, possibly in a database.
- Allow for different methods of calculating averages and ranks.
- Implement strictly SOLID

## Running the Project

To run the project, start the main class. The program will prompt you to input the number of students, and their scores for each course. It will then display student scores, averages, and ranks, and finally, class averages for each course.

## Contribution

Contributions are welcome. Please submit a pull request or open an issue to propose changes or additions.

## Licence

This project is licenced under the MIT licence. See the LICENCE file for more details.
