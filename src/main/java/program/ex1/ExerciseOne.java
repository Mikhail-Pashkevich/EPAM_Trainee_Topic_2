package program.ex1;

import static functions.DifferentFunction.GCF;
import static functions.DifferentFunction.LCM;

public class ExerciseOne {
    public void function(int a, int b) {

        System.out.println("НОД(" + a + ", " + b + ") = " + GCF(a, b));
        System.out.println("НОК(" + a + ", " + b + ") = " + LCM(a, b));
    }
}
