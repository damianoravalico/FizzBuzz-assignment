package dssc.assignment.fizzbuzz;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzConverterTest {

    @Test
    public void convertOneAsIntegerToString() {
        assertEquals("1", FizzBuzzConverter.convert(1));
    }

    @Test
    public void convertTwoAsIntegerToString() {
        assertEquals("2", FizzBuzzConverter.convert(2));
    }

    @Test
    public void convertThreeAsIntegerToFizz() {
        assertEquals("Fizz", FizzBuzzConverter.convert(3));
    }

    @Test
    public void convertThreeMultiplesToFizz() {
        assertEquals("Fizz", FizzBuzzConverter.convert(6));
        assertEquals("Fizz", FizzBuzzConverter.convert(21));
    }

    @Test
    public void convertFiveAsIntegerToBuzz() {
        assertEquals("Buzz", FizzBuzzConverter.convert(5));
    }

    @Test
    public void convertFiveMultiplesToFizz() {
        assertEquals("Buzz", FizzBuzzConverter.convert(10));
        assertEquals("Buzz", FizzBuzzConverter.convert(50));
    }

    @Test
    public void convertThreeAndFiveMultiplesToFizzBuzz() {
        assertEquals("FizzBuzz", FizzBuzzConverter.convert(15));
        assertEquals("FizzBuzz", FizzBuzzConverter.convert(30));
    }

    @Test
    public void convertSomeNumbers() {
        assertEquals("FizzBuzz", FizzBuzzConverter.convert(45));
        assertEquals("Fizz", FizzBuzzConverter.convert(9));
        assertEquals("Buzz", FizzBuzzConverter.convert(25));
    }

    @Test
    public void convertFifteenNumbers() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        FizzBuzzConverter.main();
        String forOutput = "1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n11\nFizz\n13\n14\nFizzBuzz\n";
        assertEquals(forOutput, outputStream.toString());
    }

}
