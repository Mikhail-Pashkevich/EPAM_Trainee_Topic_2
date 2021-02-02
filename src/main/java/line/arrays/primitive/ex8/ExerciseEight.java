package line.arrays.primitive.ex8;

public class ExerciseEight {
    public void function(double[] array) {

        // find min
        double min = array[0];
        for (int i = 1, arrayLength = array.length; i < arrayLength; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }

        // find count of min
        int counter = 0;
        for (double element : array) {
            if (element == min) {
                counter++;
            }
        }

        // add all not min element to newArray
        double[] newArray = new double[array.length - counter];
        for (int i = 0, j = 0, arrayLength = array.length; i < arrayLength; i++) {
            if (array[i] != min) {
                newArray[j] = array[i];
                j++;
            }
        }

        // show newArray
        for (double element : newArray) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
