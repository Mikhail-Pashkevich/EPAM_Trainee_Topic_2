package line.arrays.primitive;

import line.arrays.primitive.ex1.ExerciseOne;
import line.arrays.primitive.ex10.ExerciseTen;
import line.arrays.primitive.ex2.ExerciseTwo;
import line.arrays.primitive.ex3.ExerciseThree;
import line.arrays.primitive.ex4.ExerciseFour;
import line.arrays.primitive.ex5.ExerciseFive;
import line.arrays.primitive.ex6.ExerciseSix;
import line.arrays.primitive.ex7.ExerciseSeven;
import line.arrays.primitive.ex8.ExerciseEight;
import line.arrays.primitive.ex9.ExerciseNine;

public class RunnerLineArrayTasks {
    public static void main(String[] args) {

        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        System.out.println("Задание 1:");
        // expect 45 if k == 3
        System.out.println(new ExerciseOne().function(array, 3));


        System.out.println("\nЗадание 2:");
        //expect {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 10, 10} and counter = 5
        new ExerciseTwo().function(array, 10);


        array = new int[]{-2, -1, 0, 1, 2, 3};
        System.out.println("\nЗадание 3:");
        //expect 3, 2, 1
        new ExerciseThree().function(array);


        System.out.println("\nЗадание 4:");
        //expect {3, -1, 0, 1, 2, -2}
        new ExerciseFour().function(array);


        array = new int[]{1, 2, 3, 3, 2, 1};
        System.out.println("\nЗадание 5:");
        //expect {1, 2, 3}
        new ExerciseFive().function(array);


        double[] arrayDouble = new double[]{1.1, 1.2, 1.3, 1.4, 1.5, 1.6, 1.7, 1.9, 1.8};
        System.out.println("\nЗадание 6:");
        //expect '6.8'
        new ExerciseSix().function(arrayDouble);


        System.out.println("\nЗадание 7:");
        //expect '3.1'
        new ExerciseSeven().function(arrayDouble);


        arrayDouble = new double[]{1.1, 1.2, 1.3, 1.1, 1.5, 1.1, 1.7, 1.1, 1.8};
        System.out.println("\nЗадание 8:");
        //expect {1.2, 1.3, 1.5, 1.7, 1.8}
        new ExerciseEight().function(arrayDouble);


        arrayDouble = new double[]{2, 1, 3, 4, 4, 5, 1, 1, 2, 2};
        System.out.println("\nЗадание 9:");
        //expect 'Число: 1 встречалось 3 раз'
        new ExerciseNine().function(arrayDouble);


        arrayDouble = new double[]{1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4};
        System.out.println("\nЗадание 10:");
        //expect {1, 3, 1, 3, 1, 3, 0, 0, 0, 0, 0, 0}
        new ExerciseTen().function(arrayDouble);
    }
}
