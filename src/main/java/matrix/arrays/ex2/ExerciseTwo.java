package matrix.arrays.ex2;

public class ExerciseTwo {
    public void function(int[][] array) {
        int numberRow = array.length;
        int numberColumn = array[0].length;

        for (int i = 0; i < numberRow; i++) {
            for (int j = 0; j < numberColumn; j++) {
                if (i == j) {
                    System.out.print(array[i][j] + " ");
                }
            }
        }
        System.out.println();
    }
}