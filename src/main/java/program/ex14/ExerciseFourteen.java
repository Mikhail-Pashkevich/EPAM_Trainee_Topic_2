package program.ex14;

import static java.lang.Math.pow;

public class ExerciseFourteen {
    public void function(int k) {
        for (int i = 1; i < k; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + "  ");
            }
        }
        System.out.println();
    }

    private boolean isArmstrong(int number) {
        int count = digitsNumber(number);
        int buffer = number;
        int result = 0;

        while (buffer != 0) {
            result += pow(buffer % 10, count);
            buffer /= 10;
        }

        return result == number;
    }

    private int digitsNumber(int number) {
        int counter = 1;
        while (number / 10 != 0) {
            counter++;
            number /= 10;
        }
        return counter;
    }
}
