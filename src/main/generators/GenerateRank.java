package main.generators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class GenerateRank {
    public static List<Double> averages = new ArrayList<>();

    public static void addRank(double average){
        averages.add(average);
    }

    public static int rank(double average){
        if(!averages.contains(average)){
            addRank(average);
        }
        Collections.sort(averages, Collections.reverseOrder());
        int position = averages.indexOf(average);
        int rank = position + 1;
        return rank;
    }
}
