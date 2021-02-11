package program.ex12;

import static functions.DifferentFunction.showArray;

public class ExerciseTwelve {
    public void function(int k, int n) {
        int counter = 0;

        for (int i = 1; i < n; i++) {
            if (sumDigits(i) == k) {
                counter++;
            }
        }

        int[] array = new int[counter];
        counter = 0;

        for (int i = 1; i < n; i++) {
            if (sumDigits(i) == k) {
                array[counter] = i;
                counter++;
            }
        }

        showArray(array);
    }

    private int sumDigits(int number) {
        int result = 0;

        while (number != 0) {
            result += number % 10;
            number /= 10;
        }

        return result;
    }
}
