package dssc.assignment.fizzbuzz;

import org.junit.jupiter.api.Test;

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

}
