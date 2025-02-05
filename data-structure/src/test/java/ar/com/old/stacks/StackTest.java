package ar.com.old.stacks;

import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    @Test
    void shouldAddNodeToTop() {
        Stack stack = new Stack();
        stack.push(1);
        assertEquals(1, stack.peek());
    }

    @Test
    void shouldRemoveTop() {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        assertEquals(2, stack.peek());
        stack.pop();
        assertEquals(1, stack.peek());
    }

    @Test
    void shouldThrowExceptionWhenEmpty() {
        Stack stack = new Stack();
        assertThrows(EmptyStackException.class, stack::pop);
        assertThrows(EmptyStackException.class, stack::peek);
    }

    @Test
    void shouldReturnTop() {
        Stack stack = new Stack();
        stack.push(4);
        assertEquals(4, stack.peek());
    }

    @Test
    void shouldVerifyEmpty() {
        Stack stack = new Stack();
        assertTrue(stack.isEmpty());
        stack.push(1);
        assertFalse(stack.isEmpty());
    }
}