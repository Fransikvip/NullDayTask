package Tasks;

public class Task5 {
    public static void main(String[] args) {


        double number1 = 2.0;
        double number2 = -1.2;
        double number3 = 0.0;

        System.out.println("Числа: " + number1 + ", " + number2 + ", " + number3);

        if (number1 >= 0) {
            number1 = number1 * number1;
        } else {
            number1 = Math.pow(number1, 4);
        }

        if (number2 >= 0) {
            number2 = number2 * number2;
        } else {
            number2 = Math.pow(number2, 4);
        }

        if (number3 >= 0) {
            number3 = number3 * number3;
        } else {
            number3 = Math.pow(number3, 4);
        }
        System.out.println("Новые значения: " + number1 + ", " + number2 + ", " + number3);

        System.out.println();
    }
}
