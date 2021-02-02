package line.arrays.primitive.ex2;

public class ExerciseTwo {
    public void function(int[] array, int z) {

        int counter = 0;
        for (int i = 0, arrayLength = array.length; i < arrayLength; i++) {
            if (array[i] > z) {
                array[i] = z;
                counter++;
            }
        }

        System.out.println("Результирующий массив:");
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
        System.out.println("Количество замен = " + counter);
    }
}
