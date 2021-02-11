package program.ex9;

import static java.lang.Math.sqrt;

public class ExerciseNine {
    public void function(double x, double y, double z, double t) {
        double d1 = sqrt(x * x + y * y);
        double p = (z + t + d1) / 2;
        double square = sqrt(p * (p - z) * (p - t) * (p - d1)) + x * y / 2;
        System.out.println("площадь четырехугольника = " + square);
    }
}
