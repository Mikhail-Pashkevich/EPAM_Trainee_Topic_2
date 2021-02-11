package program.ex5;

import static functions.DifferentFunction.showArray;

public class ExerciseFive {
    public void function(int[] array) {
        int arraySize = array.length;
        int max = array[0];
        int preMax = array[0];

        for (int i = 1; i < arraySize; i++) {
            if (max < array[i]) {
                max = array[i];
            }
            if (preMax < array[i] && array[i] < max) {
                preMax = array[i];
            }
        }

        showArray(array);
        System.out.println("максимальны = " + max + " ," + "предыдущий за максимальным = " + preMax);
    }
}
