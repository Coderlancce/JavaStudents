package main.calculators;

import java.util.Collections;
import java.util.List;

public class RankCalculator {

    private Integer rank;

    public Integer calculatorRank(List<AverageCalculator> averages, AverageCalculator current){
        // Agregar el promedio actual a la lista
        if(!averages.contains(current)){
            averages.add(current);
        }

        // Ordenar la lista en orden descendente
        Collections.sort(averages, Collections.reverseOrder());

        // Encontrar la posición del promedio actual
        int position = averages.indexOf(current);

        // Asignar el rango basado en la posición (posición + 1)
        int rank = position + 1;

        return this.rank = rank;
    }

    public Integer getRank(){
        return rank;
    }
}
