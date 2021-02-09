package line.arrays.sort.ex1;

import static functions.DifferentFunction.showArray;

public class ExerciseOne {
    // do it without third array unreal
    public void function(int[] array1, int[] array2, int k) {
        int[] array = new int[array1.length + array2.length];

        System.arraycopy(array1, 0, array, 0, k);
        System.arraycopy(array2, 0, array, k, array2.length);
        System.arraycopy(array1, k, array, k + array2.length, array1.length - k);

        showArray(array);
    }
}

