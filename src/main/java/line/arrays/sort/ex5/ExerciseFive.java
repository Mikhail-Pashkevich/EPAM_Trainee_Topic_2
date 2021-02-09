package line.arrays.sort.ex5;

import static functions.DifferentFunction.showArray;

public class ExerciseFive {
    // сортировка вставками
    public void function(int[] array) {
        int arraySize = array.length;

        for (int i = 1; i < arraySize; i++) {

            int key = array[i];
            int minIndex = searchIndex(array, 0, i, key);

            System.arraycopy(array, minIndex, array, minIndex + 1, i - minIndex);
            array[minIndex] = key;
        }

        showArray(array);
    }

    private int searchIndex(int[] array, int first, int last, int key) {
        int middle;

        // do nothing
        if (key <= array[last - 1]) {
            return last;
        }
        // rewrite all elements until element != key
        if (key >= array[first]) {
            return first;
        }

        while (true) {
            middle = first + (last - first) / 2;
            if (last - first <= 1) {
                if (key > array[first]) {
                    return first;
                } else {
                    return last;
                }
            }

            // if key >= array's middle than search in first half
            // else find in second half
            if (key >= array[middle]) {
                last = middle;
            } else {
                first = middle;
            }
        }
    }
}
