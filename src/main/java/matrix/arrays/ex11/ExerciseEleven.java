package matrix.arrays.ex11;

import static java.lang.Math.random;

public class ExerciseEleven {
    public void function() {
        double[][] array = new double[10][20];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                array[i][j] = random() * 15;
            }
        }

        int counter;

        for (int i = 0; i < 10; i++) {
            counter = 0;
            for (int j = 0; j < 20; j++) {
                if (array[i][j] == 5) {
                    counter++;
                }
            }
            if (counter >= 3) {
                System.out.println("Число 5 встречалось более 3 раз в строке в индексом = " + i);
            }
        }
    }
}
