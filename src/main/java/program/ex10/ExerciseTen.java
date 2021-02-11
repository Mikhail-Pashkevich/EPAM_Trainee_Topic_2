package program.ex10;

import static functions.DifferentFunction.showArray;

public class ExerciseTen {
    public void function(String number) {
        int length = number.length();
        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            array[i] = number.charAt(i) - '0';
        }

        System.out.println("число = " + number);
        showArray(array);
    }
}
