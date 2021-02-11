package program.ex11;

public class ExerciseEleven {
    public void function(String number1, String number2) {
        int length1 = number1.length();
        int length2 = number2.length();

        if (length1 > length2) {
            System.out.println("в числе " + number1 + " больше цифр чем в " + number2);
        } else {
            if (length1 < length2) {
                System.out.println("в числе " + number2 + " больше цифр чем в " + number1);
            } else {
                System.out.println("число цифр в числах " + number1 + " и " + number2 + " равно");
            }
        }
    }
}
