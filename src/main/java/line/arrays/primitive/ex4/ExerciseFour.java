package line.arrays.primitive.ex4;


public class ExerciseFour {
    public void function(int[] array) {
        int indexMin = 0;
        int indexMax = 0;

        for (int i = 1, arraySize = array.length; i < arraySize; i++) {
            if (array[indexMax] < array[i]) {
                indexMax = i;
                continue;
            }
            if (array[indexMin] > array[i]) {
                indexMin = i;
            }
        }
        //swap(array[indexMax],array[indexMin]);
        int buf = array[indexMax];
        array[indexMax] = array[indexMin];
        array[indexMin] = buf;


        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
