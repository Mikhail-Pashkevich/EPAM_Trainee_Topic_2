package program.ex6;

import static functions.DifferentFunction.GCF;

public class ExerciseSix {
    public void function(int a, int b, int c) {
        if (GCF(a, b) == 1 && GCF(a, c) == 1 && GCF(c, b) == 1) {
            System.out.println("числа " + a + ", " + b + ", " + c + " являются взаимнопростыми");
        } else {
            System.out.println("числа " + a + ", " + b + ", " + c + " не являются взаимнопростыми");
        }
    }
}
