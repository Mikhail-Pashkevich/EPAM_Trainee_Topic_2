package matrix.arrays;

public class DifferentFunction {
    public static void showArray(double[][] array) {
        for (double[] row : array) {
            for (double number : row) {
                System.out.print(number + "\t");
            }
            System.out.println();
        }
    }

    public static void showArray(int[][] array) {
        for (int[] row : array) {
            for (int number : row) {
                System.out.print(number + "\t");
            }
            System.out.println();
        }
    }


}
