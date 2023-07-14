package main.inputs;

import main.generators.GenerateText;

public class NumberStudents{
    public static int getNumber() {
        GenerateText.generate("How many students are in this class?: ");
        return InputNumber.getNumber();
    }
}
