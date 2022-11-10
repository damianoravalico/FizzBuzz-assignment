package dssc.assignment.fizzbuzz;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzConverterTest {

    @ParameterizedTest
    @CsvSource({"1, 1", "2, 2", "4, 4"})
    public void convertIntegersToString(int number, String result) {
        assertEquals(result, FizzBuzzConverter.convert(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 6, 21})
    public void convertThreeMultiplesToFizz(int number) {
        assertEquals("Fizz", FizzBuzzConverter.convert(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 10, 50})
    public void convertFiveMultiplesToFizz(int number) {
        assertEquals("Buzz", FizzBuzzConverter.convert(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {15, 30, 45})
    public void convertThreeAndFiveMultiplesToFizz(int number) {
        assertEquals("FizzBuzz", FizzBuzzConverter.convert(number));
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
