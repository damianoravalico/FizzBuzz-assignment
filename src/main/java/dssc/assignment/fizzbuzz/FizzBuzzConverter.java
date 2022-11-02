package dssc.assignment.fizzbuzz;

public class FizzBuzzConverter {

    public static void main(String[] args) {

    }

    public String fizzBuzzConvert(int number) {
        if (number % 3 == 0) {
            return "Fizz";
        }
        return String.valueOf(number);
    }

}
