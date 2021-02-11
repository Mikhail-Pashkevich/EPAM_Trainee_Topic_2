package program.ex1;

import static functions.DifferentFunction.GCF;

public class ExerciseOne {
    public void function(int a, int b) {
        int gcf = GCF(a, b);

        System.out.println("НОД(" + a + ", " + b + ") = " + gcf);
        System.out.println("НОК(" + a + ", " + b + ") = " + a * b / gcf);
    }
}
