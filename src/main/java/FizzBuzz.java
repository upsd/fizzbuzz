public class FizzBuzz {

    public static String calculate(int num) {
        String textToReturn = "";

        if (isDivisibleBy(num, 3)) {
            textToReturn += "Fizz";
        }
        if (isDivisibleBy(num, 5)) {
            textToReturn += "Buzz";
        }

        if (textToReturn.length() == 0) {
            textToReturn = Integer.toString(num);
        }

        return textToReturn;
    }

    private static boolean isDivisibleBy(int toBeDivided, int divisor) {
        return toBeDivided % divisor == 0;
    }
}
