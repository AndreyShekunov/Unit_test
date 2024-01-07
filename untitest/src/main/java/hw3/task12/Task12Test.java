package hw3.task12;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Task12Test {
    @ParameterizedTest
    @ValueSource(ints = {4, 0, -6})
    public void testEvenNumber(int number) {
        Task12 yourObject = new Task12();
        boolean result = yourObject.isEvenOrOddNumber(number);
        assertTrue(result, number + " должно считаться четным.");
    }

    @ParameterizedTest
    @ValueSource(ints = {7, -3})
    public void testOddNumber(int number) {
        Task12 yourObject = new Task12();
        boolean result = yourObject.isEvenOrOddNumber(number);
        assertFalse(result, number + " должно считаться нечетным.");
    }

    @ParameterizedTest
    @ValueSource(ints = {50, 75, 99})
    public void testNumberInIntervalWithinBounds(int number) {
        Task12 yourObject = new Task12();
        boolean result = yourObject.numberInInterval(number);
        assertTrue(result, "Число " + number + " должно попадать в интервал (25;100).");
    }

    @ParameterizedTest
    @ValueSource(ints = {10, 24, 101})
    public void testNumberInIntervalOutsideBounds(int number) {
        Task12 yourObject = new Task12();
        boolean result = yourObject.numberInInterval(number);
        assertFalse(result, "Число " + number + " не должно попадать в интервал (25;100).");
    }
}
