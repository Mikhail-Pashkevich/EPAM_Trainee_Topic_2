package matrix.arrays.ex10;

public class ExerciseTen {
    public void function(int[][] array) {
        int numberRow = array.length;
        int numberColumn = array[0].length;

        for (int i = 0; i < numberRow; i++) {
            for (int j = 0; j < numberColumn; j++) {
                if (i == j && array[i][j] > 0) {
                    System.out.print(array[i][j] + " ");
                }
            }
        }
        System.out.println();
    }
}
