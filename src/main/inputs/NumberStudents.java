package main.inputs;

import main.view.GenerateText;

public class NumberStudents{
    public static int getNumber() {
        GenerateText.generate("How many students are in this class?: ");
        return InputNumber.getNumber();
    }
}
