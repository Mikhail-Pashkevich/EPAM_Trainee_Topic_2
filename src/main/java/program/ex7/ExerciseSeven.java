package program.ex7;

public class ExerciseSeven {
    public void function() {
        int result = 0;
        for (int i = 1; i < 10; i++) {
            if (i % 2 == 1) {
                result += getFactorial(i);
            }
        }
        System.out.println(result);
    }

    private int getFactorial(int f) {
        int result = 1;
        for (int i = 2; i <= f; i++) {
            result *= i;
        }
        return result;
    }
}
