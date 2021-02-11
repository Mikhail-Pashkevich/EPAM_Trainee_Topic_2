package program.ex8;

public class ExerciseEight {
    public void function(int[] array) {

        System.out.println("сумма элементов с 1 до 3 = " + sum(array, 1, 3));
        System.out.println("сумма элементов с 1 до 3 = " + sum(array, 3, 5));
        System.out.println("сумма элементов с 1 до 3 = " + sum(array, 4, 6));
    }

    private int sum(int[] array, int k, int m) {
        int result = 0;
        for (int i = k; i <= m; i++) {
            result += array[i];
        }
        return result;
    }
}
