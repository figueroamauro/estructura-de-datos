package ar.com.old.exercices.recursion;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @ParameterizedTest
    @CsvSource({
                       "4,24",
                       "5,120",
                       "3,6",
                       "1,1" })
    void shouldReturnFactorial(int value, int expect) {
        Factorial factorial = new Factorial();
        int result = factorial.calculateFactorial(value);
        assertEquals(expect, result);
    }
}