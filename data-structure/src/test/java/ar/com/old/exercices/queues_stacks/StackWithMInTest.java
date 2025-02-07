package ar.com.old.exercices.queues_stacks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackWithMInTest {

        @Test
        void shouldReturnMinValue(){
                StackWithMIn stack = new StackWithMIn();
                stack.push(6);
                stack.push(5);
                stack.push(4);
                assertEquals(4, stack.getMin());
                stack.push(2);
                assertEquals(2,stack.getMin());
                stack.push(7);
                assertEquals(2, stack.getMin());
                stack.pop();
                stack.pop();
                assertEquals(4,stack.getMin());
        }
}