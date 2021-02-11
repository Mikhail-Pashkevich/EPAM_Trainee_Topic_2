package program.ex16;

import static java.lang.Math.pow;

public class ExerciseSixteen {
    public void function(int n) {

        int result = 0;
        for (int i = (int) pow(10, n - 1); i < pow(10, n); i++) {
            if (isOddNumber(i)) {
                result += i;
                System.out.print(i + "  ");
            }
        }
        System.out.println();
        System.out.println("сумма = " + result);
        System.out.println("четных цифр = " + howMuchEvenDigits(result));
    }

    private boolean isOddNumber(int number) {
        while (number != 0) {
            if ((number % 10) % 2 == 0) {
                return false;
            }
            number /= 10;
        }
        return true;
    }

    private int howMuchEvenDigits(int number) {
        int counter = 0;

        while (number != 0) {
            if (number % 10 % 2 == 0) {
                counter++;
            }
            number /= 10;
        }
        return counter;
    }
}
