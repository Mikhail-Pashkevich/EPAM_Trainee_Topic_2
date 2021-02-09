package matrix.arrays;

import matrix.arrays.ex1.ExerciseOne;
import matrix.arrays.ex10.ExerciseTen;
import matrix.arrays.ex11.ExerciseEleven;
import matrix.arrays.ex12.ExerciseTwelve;
import matrix.arrays.ex13.ExerciseThirteen;
import matrix.arrays.ex14.ExerciseFourteen;
import matrix.arrays.ex15.ExerciseFifteen;
import matrix.arrays.ex16.ExerciseSixteen;
import matrix.arrays.ex2.ExerciseTwo;
import matrix.arrays.ex3.ExerciseThree;
import matrix.arrays.ex4.ExerciseFour;
import matrix.arrays.ex5.ExerciseFive;
import matrix.arrays.ex6.ExerciseSix;
import matrix.arrays.ex7.ExerciseSeven;
import matrix.arrays.ex8.ExerciseEight;
import matrix.arrays.ex9.ExerciseNine;

import java.util.Scanner;

import static functions.DifferentFunction.copyOf;

public class RunnerMatrixArrayTask {
    public static void main(String[] args) {

        System.out.println("Задание 1:");
        int[][] array = {
                {1, 4, 3, 0},
                {2, 3, 0, 1},
                {3, 2, 0, 10},
                {4, 1, 0, 4}};
        // expect only 2 and 3 column
        new ExerciseOne().function(copyOf(array));


        System.out.println("\nЗадание 2:");
        //expect '1 3 0 4'
        new ExerciseTwo().function(copyOf(array));


        System.out.println("\nЗадание 3:");
        // expect 1 4 3 0 and
        //        0 1 10 4
        new ExerciseThree().function(copyOf(array), 0, 3);


        System.out.println("\nЗадание 4:");
        // expect
        // 1 2 3 4 5 6
        // 6 5 4 3 2 1
        // 1 2 3 4 5 6
        // 6 5 4 3 2 1
        // 1 2 3 4 5 6
        // 6 5 4 3 2 1
        new ExerciseFour().function(6);


        System.out.println("\nЗадание 5:");
        // expect
        // 1 1 1 1 1 1
        // 2 2 2 2 2 0
        // 3 3 3 3 0 0
        // 4 4 4 0 0 0
        // 5 5 0 0 0 0
        // 6 0 0 0 0 0
        new ExerciseFive().function(6);


        System.out.println("\nЗадание 6:");
        // expect
        // 1 1 1 1 1 1
        // 0 1 1 1 1 0
        // 0 0 1 1 0 0
        // 0 1 1 1 1 0
        // 1 1 1 1 1 1
        new ExerciseSix().function(6);


        System.out.println("\nЗадание 7:");
        // expect that for each array[i][j]: 0 <= array[i][j] <= 1
        new ExerciseSeven().function(6);


        System.out.println("\nЗадание 8:");
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt(), p = scanner.nextInt();
        // expect if 0 1
        // 4 1 3 0
        // 3 2 0 1
        // 2 3 0 10
        // 1 4 0 4
        new ExerciseEight().function(copyOf(array), k, p);


        System.out.println("\nЗадание 9:");
        // expect 'Индекс столбца с максимальной суммой = 3'
        new ExerciseNine().function(copyOf(array));


        System.out.println("\nЗадание 10:");
        // expect 4 2 4
        new ExerciseTen().function(copyOf(array));


        System.out.println("\nЗадание 11:");
        new ExerciseEleven().function();


        System.out.println("\nЗадание 12:");
        new ExerciseTwelve().function(copyOf(array));


        System.out.println("\nЗадание 13:");
        new ExerciseThirteen().function(copyOf(array));


        System.out.println("\nЗадание 14:");
        new ExerciseFourteen().function();


        System.out.println("\nЗадание 15:");
        // expect
        // 10 4 10 0
        // 2 10 0 10
        // 10 2 0 10
        // 4 10 0 4
        new ExerciseFifteen().function(copyOf(array));


        System.out.println("\nЗадание 16:");
        // expect
        // 3	16	9	22	15
        // 20	8	21	14	2
        // 7	25	13	1	19
        // 24	12	5	18	6
        // 11	4	17	10	23
        new ExerciseSixteen().function(5);

    }
}
