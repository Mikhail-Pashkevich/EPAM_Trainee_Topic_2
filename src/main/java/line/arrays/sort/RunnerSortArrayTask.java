package line.arrays.sort;

import line.arrays.sort.ex1.ExerciseOne;
import line.arrays.sort.ex2.ExerciseTwo;
import line.arrays.sort.ex3.ExerciseThree;
import line.arrays.sort.ex4.ExerciseFour;
import line.arrays.sort.ex5.ExerciseFive;
import line.arrays.sort.ex6.ExerciseSix;
import line.arrays.sort.ex7.ExerciseSeven;
import line.arrays.sort.ex8.ExerciseEight;

import static functions.DifferentFunction.arraycopy;

public class RunnerSortArrayTask {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] array2 = {3, 4, 5, 6};
        System.out.println("Задание 1:");
        // expect 1  2  3  4  5  6  7  3  4  5  6  8  9
        new ExerciseOne().function(array1, array2, 7);


        System.out.println("\nЗадание 2:");
        // expect 1  2  3  3  4  4  5  5  6  6  7  8  9
        new ExerciseTwo().function(array1, array2);


        System.out.println("\nЗадание 3:");
        // expect 9  8  7  6  5  4  3  2  1
        new ExerciseThree().function(arraycopy(array1));


        System.out.println("\nЗадание 4:");
        // expect 9  8  7  6  5  4  3  2  1
        new ExerciseFour().function(arraycopy(array1));


        System.out.println("\nЗадание 5:");
        // expect 9  8  7  6  5  4  3  2  1
        new ExerciseFive().function(arraycopy(array1));


        int[] array3 = {5, 2, 4, 6, 1, 3};
        System.out.println("\nЗадание 6:");
        // expect 1  2  3  3  4  5  6
        new ExerciseSix().function(arraycopy(array3));


        System.out.println("\nЗадание 7:");
        new ExerciseSeven().function(array1, array2);


        int[] numerator = {2, 2, 1, 6, 5, 4, 7};
        int[] denominator = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("\nЗадание 8:");
        new ExerciseEight().function(numerator, denominator);

    }
}
