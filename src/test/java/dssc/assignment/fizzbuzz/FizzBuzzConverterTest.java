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
    @ValueSource(ints = {3, 6, 12})
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

    @ParameterizedTest
    @ValueSource(ints = {7, 14, 28})
    public void convertSevenMultiplesToBang(int number) {
        assertEquals("Bang", FizzBuzzConverter.convert(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {21, 42, 63})
    public void convertThreeAndSevenMultiplesToFizzBang(int number) {
        assertEquals("FizzBang", FizzBuzzConverter.convert(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {35, 70, 140})
    public void convertFiveAndSevenMultiplesToFizzBang(int number) {
        assertEquals("BuzzBang", FizzBuzzConverter.convert(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {105, 210, 315})
    public void convertThreeAndFiveAndSevenMultiplesToFizzBuzzBang(int number) {
        assertEquals("FizzBuzzBang", FizzBuzzConverter.convert(number));
    }

    @Test
    public void convertFifteenNumbersOnOutputStream() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        FizzBuzzConverter.main();
        String forOutput = "1\n2\nFizz\n4\nBuzz\nFizz\nBang\n8\nFizz\nBuzz\n11\nFizz\n13\nBang\nFizzBuzz\n";
        assertEquals(forOutput, outputStream.toString());
    }

}
