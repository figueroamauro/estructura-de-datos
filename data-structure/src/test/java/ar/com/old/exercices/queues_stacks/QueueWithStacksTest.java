package ar.com.old.exercices.queues_stacks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueWithStacksTest {
    @Test
    void shouldCreateQueueWithTwoStacks() {
        QueueWithStacks queue = new QueueWithStacks();
        assertNotNull(queue);
        assertNotNull(queue.firstStack);
        assertNotNull(queue.secondStack);
    }

    @Test
    void shouldAddElementToQueue() {
        QueueWithStacks queue = new QueueWithStacks();
        queue.add(1);
        assertEquals(1, queue.peek());
    }

}