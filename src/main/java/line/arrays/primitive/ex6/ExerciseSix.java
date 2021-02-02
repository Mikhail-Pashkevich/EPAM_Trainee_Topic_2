package line.arrays.primitive.ex6;

public class ExerciseSix {
    public void function(double[] array) {
        double result = 0;

        for (int i = 0, arraySize = array.length; i < arraySize; i++) {
            if (isSimple(i + 1)) {
                result += array[i];
            }
        }

        System.out.println(result);
    }

    private boolean isSimple(int number) {

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
