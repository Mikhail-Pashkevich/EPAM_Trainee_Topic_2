package matrix.arrays.ex7;

import java.text.DecimalFormat;

import static java.lang.Math.sin;

public class ExerciseSeven {
    public void function(int n) {
        double[][] array = new double[n][n];
        int counter = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = sin(((double) i * i - (double) j * j) / (double) n);
                if (array[i][j] < 0) {
                    counter++;
                }
            }
        }

        DecimalFormat format = new DecimalFormat("#0.0000");
        for (double[] row : array) {
            for (double number : row) {
                System.out.print(format.format(number) + "\t");
            }
            System.out.println();
        }

        System.out.println("Количество положительных = " + counter);
    }
}
