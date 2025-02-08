package ar.com.old.exercices.recursion;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @ParameterizedTest
    @CsvSource({
            "0,0",
            "1,1",
            "2,1",
            "3,2",
            "4,3",
            "5,5",
            "6,8"
    })
    void shouldReturnCorrectNumber(int value, int expected) {
        Fibonacci fibonacci = new Fibonacci();
        int result = fibonacci.fibonacci(value);
        assertEquals(expected, result);

    }

}