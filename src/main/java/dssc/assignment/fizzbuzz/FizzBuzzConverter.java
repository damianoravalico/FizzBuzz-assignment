package dssc.assignment.fizzbuzz;

public class FizzBuzzConverter {

    public static void main(String[] args) {

    }

    public String fizzBuzzConvert(int number) {
        if ((number % 3 == 0) && (number % 5 == 0)) {
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
