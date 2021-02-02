package line.arrays.primitive.ex10;

public class ExerciseTen {
    public void function(double[] array) {
        for (int i = 1, arraySize = array.length; i < arraySize; i++) {

            int j = i;
            for (; j < arraySize - (i / 2 + 1); j++) {
                array[j] = array[j + 1];
            }
            array[j] = 0;
        }

        for (double element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
