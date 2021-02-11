package program.ex15;

import static java.lang.Math.pow;

public class ExerciseFifteen {
    public void function(int n) {
        int size = (int) (pow(10, n) - pow(10, n - 1));

        for (int i = (int) pow(10, n - 1); i < size; i++) {
            if (isIncrease(i)) {
                System.out.print(i + "  ");
            }
        }
        System.out.println();
    }

    private boolean isIncrease(int number) {
        int prev = number % 10;
        number /= 10;

        while (number != 0) {
            if (number % 10 >= prev) {
                return false;
            }
            prev = number % 10;
            number /= 10;
        }
        return true;
    }
}
