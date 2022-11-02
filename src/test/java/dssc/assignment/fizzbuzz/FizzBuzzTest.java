package dssc.assignment.fizzbuzz;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    public void convertOneAsIntegerToString() {
        FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();
        assertEquals("1", fizzBuzzConverter.fizzBuzzConvert(1));
    }

    @Test
    public void convertTwoAsIntegerToString() {
        FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();
        assertEquals("2", fizzBuzzConverter.fizzBuzzConvert(2));
    }

    @Test
    public void convertThreeAsIntegerToFizz() {
        FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();
        assertEquals("Fizz", fizzBuzzConverter.fizzBuzzConvert(3));
    }

    @Test
    public void convertThreeMultipleToFizz() {
        FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();
        assertEquals("Fizz", fizzBuzzConverter.fizzBuzzConvert(6));
    }

}
