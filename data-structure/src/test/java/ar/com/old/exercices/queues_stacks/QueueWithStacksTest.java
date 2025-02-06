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

    @Test
    void shouldRemoveFirstElement() {
        QueueWithStacks queue = new QueueWithStacks();
        queue.add(1);
        queue.add(3);
        queue.add(5);

        assertEquals(1, queue.remove());
        assertEquals(3, queue.peek());
    }

    @Test
    void shouldReturnQueueSize() {
        QueueWithStacks queue = new QueueWithStacks();
        queue.add(1);
        queue.add(3);
        assertEquals(2, queue.size());
    }

    @Test
    void shouldReturnIsEmpty() {
        QueueWithStacks queue = new QueueWithStacks();
        assertTrue(queue.isEmpty());
        queue.add(1);
        assertFalse(queue.isEmpty());
    }

}