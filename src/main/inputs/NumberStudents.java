package main.inputs;

import java.util.Scanner;

public class NumberStudents implements UserInput {
    @Override
    public int getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many students are in this class?: ");
        return scanner.nextInt();
    }
}
