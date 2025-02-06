package ar.com.old.exercices.queues_stacks;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesisTest {
    @ParameterizedTest
    @ValueSource(strings = {"([]){}", "()","({})"})
    void shouldReturnTrueWithValidInputs(String input) {
        ValidParenthesis validParenthesis = new ValidParenthesis();

        assertTrue(validParenthesis.isValidParenthesis(input));
    }

    @ParameterizedTest
    @ValueSource(strings = {")", " ", "{()", "{(})", "[]{}[}"})
    void shouldReturnFalseWithInvalidInputs(String input) {
        ValidParenthesis validParenthesis = new ValidParenthesis();

        assertFalse(validParenthesis.isValidParenthesis(input));
    }

}