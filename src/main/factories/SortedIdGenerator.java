package main.factories;

public class SortedIdGenerator{

    private static int number = 0;
    public static String generateId() {
        return "STD" + String.format("%02d", generateNumber());
    }

    public static int generateNumber(){
        return ++number;
    }
}
