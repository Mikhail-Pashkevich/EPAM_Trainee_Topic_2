package program.ex4;

import static functions.DifferentFunction.showArray;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class ExerciseFour {
    public void function(double[] array) {
        int arraySize = array.length;
        double maxDistance = 0;
        double buffer;

        for (int i = 0; i < arraySize; i += 2) {
            for (int j = i; j < arraySize; j += 2) {
                buffer = distance(array[i], array[i + 1], array[j], array[j + 1]);
                if (maxDistance < buffer) {
                    maxDistance = buffer;
                }
            }
        }

        showArray(array);
        System.out.println("максимальное расстояние = " + maxDistance);
    }

    private double distance(double x1, double y1, double x2, double y2) {
        return sqrt(pow(x1 - x2, 2) + pow(y1 - y2, 2));
    }
}
