package line.arrays.sort.ex8;

import static functions.DifferentFunction.LCM;
import static functions.DifferentFunction.showArray;

public class ExerciseEight {
    public void function(int[] numerator, int[] denominator) {

        System.out.println("исходные дроби:");
        showArray(numerator);
        showArray(denominator);

        int commonDenominator = denominator[0];

        for (int i = 1, arraySize = denominator.length; i < arraySize; i++) {
            commonDenominator = LCM(commonDenominator, denominator[i]);
        }
        for (int i = 0, arraySize = numerator.length; i < arraySize; i++) {
            numerator[i] = numerator[i] * commonDenominator / denominator[i];
            denominator[i] = commonDenominator;
        }

        System.out.println("приведенные дроби:");
        showArray(numerator);
        showArray(denominator);

        for (int i = 0, arraySize = numerator.length; i < arraySize; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arraySize; j++) {
                if (numerator[minIndex] > numerator[j]) {
                    minIndex = j;
                }
            }
            int buffer = numerator[i];
            numerator[i] = numerator[minIndex];
            numerator[minIndex] = buffer;
        }

        System.out.println("отсортированые дроби:");
        showArray(numerator);
        showArray(denominator);
    }
}
