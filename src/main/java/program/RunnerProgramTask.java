package program;

import program.ex1.ExerciseOne;
import program.ex10.ExerciseTen;
import program.ex11.ExerciseEleven;
import program.ex12.ExerciseTwelve;
import program.ex13.ExerciseThirteen;
import program.ex14.ExerciseFourteen;
import program.ex15.ExerciseFifteen;
import program.ex16.ExerciseSixteen;
import program.ex17.ExerciseSeventeen;
import program.ex2.ExerciseTwo;
import program.ex3.ExerciseThree;
import program.ex4.ExerciseFour;
import program.ex5.ExerciseFive;
import program.ex6.ExerciseSix;
import program.ex7.ExerciseSeven;
import program.ex8.ExerciseEight;
import program.ex9.ExerciseNine;

public class RunnerProgramTask {
    public static void main(String[] args) {

        System.out.println("Задание 1:");
        // expect 1 and 63
        new ExerciseOne().function(7, 9);


        System.out.println("\nЗадание 2:");
        // expect 2
        new ExerciseTwo().function(2, 4, 6, 8);


        System.out.println("\nЗадание 3:");
        // expect 25
        new ExerciseThree().function(3.102016197);


        double[] arrayDouble = {0, 0, 0, 3, 3, 4};
        System.out.println("\nЗадание 4:");
        // expect 5
        new ExerciseFour().function(arrayDouble);


        int[] arrayInt = {1, 3, 6, 5, 99, 42, 7, 12};
        System.out.println("\nЗадание 5:");
        // expect 99 and 42
        new ExerciseFive().function(arrayInt);


        System.out.println("\nЗадание 6:");
        // simple number
        new ExerciseSix().function(3, 5, 7);


        System.out.println("\nЗадание 7:");
        // expect 368_047
        new ExerciseSeven().function();


        System.out.println("\nЗадание 8:");
        // expect 14, 146, 148
        new ExerciseEight().function(arrayInt);


        System.out.println("\nЗадание 9:");
        // expect 19.6619...
        new ExerciseNine().function(4, 4, 5, 5);


        System.out.println("\nЗадание 10:");
        // expect {1, 2, 3, 6, 5, 4}
        new ExerciseTen().function("123654");


        System.out.println("\nЗадание 11:");
        // expect ==
        new ExerciseEleven().function("123", "654");


        System.out.println("\nЗадание 12:");
        // expect 19, 28, 37, 46, 55, 64, 73, 82, 91
        new ExerciseTwelve().function(10, 100);


        System.out.println("\nЗадание 13:");
        // expect
        // 7 11
        // 11 13
        new ExerciseThirteen().function(7);


        System.out.println("\nЗадание 14:");
        // expect 1 2 3 4 5 6 7 8 9 153 370 371
        new ExerciseFourteen().function(400);


        System.out.println("\nЗадание 15:");
        // expect 11 12 13... 23 24 25... 34 35 36... 45 46 47... 56 57 58 59 67 68 69 78 79 89
        new ExerciseFifteen().function(2);


        System.out.println("\nЗадание 16:");
        // expect 1375 and 0
        new ExerciseSixteen().function(2);


        System.out.println("\nЗадание 17:");
        // expect 10
        new ExerciseSeventeen().function(90);
    }
}
