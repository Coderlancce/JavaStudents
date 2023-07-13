package main.view;

import main.calculators.AverageCalculator;

import java.util.ArrayList;
import java.util.List;

public class AverageListSingleton {
    private static AverageListSingleton instance;
    private List<AverageCalculator> average;

    private AverageListSingleton() {
        average = new ArrayList<>();
    }

    public static synchronized AverageListSingleton getInstance() {
        if (instance == null) {
            instance = new AverageListSingleton();
        }
        return instance;
    }

    public List<AverageCalculator> getAverage() {
        return average;
    }
}
