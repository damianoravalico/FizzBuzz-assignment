package dssc.assignment.fizzbuzz;

public class FizzBuzzConverter {

    public static void main(String... args) {
        for (int i = 1; i <= 15; i++) {
            System.out.println(FizzBuzzConverter.convert(i));
        }
    }

    private FizzBuzzConverter() {

    }

    public static String convert(int number) {
        if (number % 15 == 0) {
            return "FizzBuzz";
        }
        if (number % 3 == 0) {
            return "Fizz";
        }
        if (number % 5 == 0) {
            return "Buzz";
        }
        return String.valueOf(number);
    }

}
