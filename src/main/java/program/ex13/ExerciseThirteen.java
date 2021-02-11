package program.ex13;

public class ExerciseThirteen {
    public void function(int n) {
        showPairs(simpleToArray(n));
    }


    private int[] simpleToArray(int n) {
        int[] array = new int[countSimple(n)];
        int c = 0;

        for (int i = n; i < 2 * n; i++) {
            if (isSimple(i)) {
                array[c] = i;
                c++;
            }
        }
        return array;
    }

    private int countSimple(int n) {
        int counter = 0;
        for (int i = n; i < 2 * n; i++) {
            if (isSimple(i)) {
                counter++;
            }
        }
        return counter;
    }

    private boolean isSimple(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    private void showPairs(int[] array) {
        int arraySize = array.length - 1;

        for (int i = 0; i < arraySize; i++) {
            System.out.println(array[i] + "  " + array[i + 1]);
        }
    }
}
