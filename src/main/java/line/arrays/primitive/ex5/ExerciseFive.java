package line.arrays.primitive.ex5;

public class ExerciseFive {
    public void function(int[] array) {
        for (int i = 0, arrayLength = array.length; i < arrayLength; i++) {
            if (array[i] > i) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }
}
