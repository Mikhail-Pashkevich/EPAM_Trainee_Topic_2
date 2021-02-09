package functions;

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

    public static void showArray(int[] array) {
        for (int number : array) {
            System.out.print(number + "  ");
        }
        System.out.println();
    }

    public static int[][] copyOf(int[][] array) {
        int m = array.length;
        int n = array[0].length;
        int[][] newArray = new int[m][n];

        for (int i = 0; i < m; i++) {
            System.arraycopy(array[i], 0, newArray[i], 0, n);
        }
        return newArray;
    }

    public static int[] arraycopy(int[] array) {
        int n = array.length;
        int[] newArray = new int[n];

        System.arraycopy(array, 0, newArray, 0, n);

        return newArray;
    }

}
