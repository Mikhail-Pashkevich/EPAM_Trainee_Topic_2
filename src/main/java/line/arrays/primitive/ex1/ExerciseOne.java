package line.arrays.primitive.ex1;

public class ExerciseOne {
    public int function(int[] array, int k) {

        int result = 0;

        for (int element : array) {
            if (element % k == 0) {
                result += element;
            }
        }

        return result;
    }
}
