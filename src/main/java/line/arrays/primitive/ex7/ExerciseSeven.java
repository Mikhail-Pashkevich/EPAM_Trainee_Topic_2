package line.arrays.primitive.ex7;

public class ExerciseSeven {
    public void function(double[] array) {

        int arraySize = array.length;
        int halfArraySize = arraySize / 2;
        if (arraySize % 2 == 1) {
            halfArraySize++;
        }
        double max = array[0] + array[arraySize - 1];

        for (int i = 1, j = arraySize - 2; i < halfArraySize; i++, j--) {
            if (max < array[i] + array[j]) {
                max = array[i] + array[j];
            }
        }

        System.out.println("Максимальная пара = " + max);
    }
}
