package line.arrays.primitive.ex9;

public class ExerciseNine {
    public void function(double[] array) {

        int counterBuffer = 0;
        double numberBuffer = array[0];

        for (int i = 0, arraySize = array.length; i < arraySize; i++) {
            int counter = 0;
            double number = array[i];

            for (int j = i; j < arraySize; j++) {
                if (number == array[j]) {
                    counter++;
                }
            }
            if (counter >= counterBuffer && number <= numberBuffer) {
                counterBuffer = counter;
                numberBuffer = number;
            }
        }

        System.out.println("Число: " + numberBuffer + " встречалось " + counterBuffer + " раз(а)");
    }
}
