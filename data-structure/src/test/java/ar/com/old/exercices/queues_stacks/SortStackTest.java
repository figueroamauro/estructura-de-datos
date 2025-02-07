package ar.com.old.exercices.queues_stacks;

import ar.com.old.stacks.Stack;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortStackTest {

    @Test
    void shouldSortStack() {
        Stack stack = new Stack();
        SortStack sortStack = new SortStack();
        stack = sortStack.sort(stack);
        stack.push(2);
        stack.push(4);
        stack.push(1);
        stack.push(5);
        stack = sortStack.sort(stack);
        assertEquals(1, stack.pop());
        assertEquals(2, stack.pop());
        assertEquals(4, stack.pop());
        assertEquals(5, stack.pop());
    }
}