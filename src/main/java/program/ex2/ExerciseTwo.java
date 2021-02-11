package program.ex2;

import static java.lang.Math.max;

public class ExerciseTwo {
    public void function(int a, int b, int c, int d) {
        int gcf = 0;
        for (int i = max(max(a, b), max(c, d)); i > 0; i--) {
            if (a % i == 0 && b % i == 0 && c % i == 0 && d % i == 0) {
                gcf = i;
                break;
            }
        }
        System.out.println("НОД(" + a + ", " + b + ", " + c + ", " + d + ") = " + gcf);
    }
}
