package matrix.arrays.ex3;

public class ExerciseThree {
    public void function(int[][] array, int k, int p) {
        int numberRow = array.length;
        int numberColumn = array[0].length;

        for (int j = 0; j < numberColumn; j++) {
            System.out.print(array[k][j] + " ");
        }
        System.out.println();
        for (int i = 0; i < numberRow; i++) {
            System.out.print(array[i][p] + " ");
        }
        System.out.println();
    }
}
