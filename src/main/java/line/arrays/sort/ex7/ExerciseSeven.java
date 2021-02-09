package line.arrays.sort.ex7;

import static functions.DifferentFunction.showArray;

public class ExerciseSeven {
    public void function(int[] array1, int[] array2) {
        int array1Size = array1.length;
        int array2Size = array2.length;

        showArray(array1);
        showArray(array2);
        int i = 0, j = 0;
        while (true) {
            if (i == array1Size) {
                System.out.println("остальные элементы второго массива идут после первого подряд");
                break;
            }
            if (j == array2Size) {
                System.out.println("элементов второго массива больше нет");
                break;
            }
            if (array2[j] < array1[i] && i == 0) {
                System.out.println("элемент второго массива = " + array2[j]
                        + " должен находится перед 0м элементом первого массива");

            }
            if (array2[j] < array1[i]) {
                System.out.println("элемент второго массива = " + array2[j]
                        + " должен находится между " + i + "м и " + (i + 1) + "м элементами первого массива");
                j++;
            } else {
                i++;
            }
        }
    }
}
