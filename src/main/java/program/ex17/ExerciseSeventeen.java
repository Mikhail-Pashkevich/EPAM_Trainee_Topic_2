package program.ex17;

public class ExerciseSeventeen {
    public void function(int number) {
        int counter = 0;

        while (number > 0) {
            counter++;
            number -= sumDigits(number);
        }
        System.out.println("количество действий = " + counter);
    }

    private int sumDigits(int number) {
        int result = 0;

        while (number != 0) {
            result += number % 10;
            number /= 10;
        }

        return result;
    }
}
