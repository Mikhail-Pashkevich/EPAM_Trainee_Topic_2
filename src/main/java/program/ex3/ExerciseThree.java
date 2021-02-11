package program.ex3;

import static java.lang.Math.sqrt;

public class ExerciseThree {
    public void function(double n) {
        System.out.println("Площадь шестиугольника = " + squareHexagon(n));
    }

    private double squareHexagon(double n) {
        return 6 * squareRectangle(n);
    }

    private double squareRectangle(double n) {
        return sqrt(3) / 4 * n * n;
    }
}
