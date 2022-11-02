package dssc.assignment.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzConverterTest {

    @Test
    public void convertOneAsIntegerToString() {
        FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();
        assertEquals("1", fizzBuzzConverter.convert(1));
    }

    @Test
    public void convertTwoAsIntegerToString() {
        FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();
        assertEquals("2", fizzBuzzConverter.convert(2));
    }

    @Test
    public void convertThreeAsIntegerToFizz() {
        FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();
        assertEquals("Fizz", fizzBuzzConverter.convert(3));
    }

    @Test
    public void convertThreeMultiplesToFizz() {
        FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();
        assertEquals("Fizz", fizzBuzzConverter.convert(6));
    }

    @Test
    public void convertFiveAsIntegerToBuzz() {
        FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();
        assertEquals("Buzz", fizzBuzzConverter.convert(5));
    }

    @Test
    public void convertFiveMultiplesToFizz() {
        FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();
        assertEquals("Buzz", fizzBuzzConverter.convert(10));
    }

    @Test
    public void convertThreeAndFiveMultiplesToFizzBuzz() {
        FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();
        assertEquals("FizzBuzz", fizzBuzzConverter.convert(15));
        assertEquals("FizzBuzz", fizzBuzzConverter.convert(30));
    }

    @Test
    public void convertSomeNumbers() {
        FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();
        assertEquals("FizzBuzz", fizzBuzzConverter.convert(45));
        assertEquals("Fizz", fizzBuzzConverter.convert(9));
        assertEquals("Buzz", fizzBuzzConverter.convert(25));
    }

}
