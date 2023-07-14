package main.inputs;

import java.util.Scanner;

public class InputNumber {
    public static Integer getNumber(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
