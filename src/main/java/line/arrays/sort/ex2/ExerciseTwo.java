package line.arrays.sort.ex2;

import static functions.DifferentFunction.showArray;

public class ExerciseTwo {
    // do it without third array unreal
    public void function(int[] array1, int[] array2) {
        int array1Size = array1.length;
        int array2Size = array2.length;
        int[] array = new int[array1Size + array2Size];

        for (int i = 0, j = 0, c = 0; ; c++) {
            if (i == array1Size) {
                while (j < array2Size) {
                    array[c] = array2[j];
                    j++;
                    c++;
                }
                break;
            }
            if (j == array2Size) {
                while (i < array1Size) {
                    array[c] = array1[i];
                    i++;
                    c++;
                }
                break;
            }
            if (array1[i] < array2[j]) {
                array[c] = array1[i];
                i++;
            } else {
                array[c] = array2[j];
                j++;
            }
        }

        showArray(array);
    }
}
