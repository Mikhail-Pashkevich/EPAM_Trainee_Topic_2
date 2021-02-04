package matrix.arrays.ex9;

import static matrix.arrays.DifferentFunction.showArray;

public class ExerciseNine {
    public void function(int[][] array) {
        int numberRow = array.length;
        int numberColumn = array[0].length;

        int result = 0;
        int resultIndex = 0;
        for (int i = 0; i < numberRow; i++) {
            result += array[i][0];
        }

        int buffer;
        int bufferIndex;
        for (int j = 1; j < numberColumn; j++) {
            buffer = 0;
            bufferIndex = j;
            for (int i = 0; i < numberRow; i++) {
                buffer += array[i][j];
            }
            if (result < buffer) {
                result = buffer;
                resultIndex = bufferIndex;
            }
        }

        showArray(array);
        System.out.println("Индекс столбца с максимальной суммой = " + resultIndex);
    }
}
