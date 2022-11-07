package dssc.assignment.fizzbuzz;

public class FizzBuzzConverter {

    public static void main(String... args) {
        FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();
        for (int i = 1; i <= 15; i++) {
            System.out.println(fizzBuzzConverter.convert(i));
        }
    }

    public String convert(int number) {
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
