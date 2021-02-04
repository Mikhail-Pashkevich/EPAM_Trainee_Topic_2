package matrix.arrays.ex1;

public class ExerciseOne {
    public void function(int[][] array) {
        int numberRow = array.length;
        int numberColumn = array[0].length;

        for (int j = 0; j < numberColumn; j++) {
            for (int i = 0; i < numberRow; i++) {
                if (j % 2 == 0  && array[0][j] > array[numberColumn - 1][j]) {
                    System.out.print(array[i][j] + "\t");
                }
            }
            System.out.println();
        }
    }
}

