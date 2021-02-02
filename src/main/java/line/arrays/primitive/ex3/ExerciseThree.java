package line.arrays.primitive.ex3;

public class ExerciseThree {
    public void function(int[] array) {
        int counterPositive = 0;
        int counterNegative = 0;
        int counterNull = 0;

        for (int element : array) {
            if (element > 0) {
                counterPositive++;
                continue;
            }
            if (element < 0) {
                counterNegative++;
            } else {
                counterNull++;
            }
        }

        System.out.println("Положительных = " + counterPositive);
        System.out.println("Отрицательных = " + counterNegative);
        System.out.println("Нулей = " + counterNull);
    }
}
