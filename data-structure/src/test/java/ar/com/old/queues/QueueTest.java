package ar.com.old.queues;

import ar.com.old.exceptions.EmptyQueueException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {
    Queue queue;

    @BeforeEach
    public void init() {
        queue = new Queue();
    }

    @Test
    void shouldAddNodeToTail() {
        queue.add(1);
        assertEquals(1, queue.last.value);
        queue.add(3);
        assertEquals(3, queue.last.value);
    }

    @Test
    void shouldRemoveFirstNode() {
        queue.add(1);
        queue.add(3);
        assertEquals(1, queue.first.value);
        queue.remove();
        assertEquals(3, queue.first.value);
    }

    @Test
    void shouldThrowException() {
        Exception exception = assertThrows(EmptyQueueException.class, queue::remove);
        Exception exception2 = assertThrows(EmptyQueueException.class, queue::peek);
        assertEquals("La cola esta vacia", exception.getMessage());
        assertEquals("La cola esta vacia", exception2.getMessage());
    }

    @Test
    void shouldReturnFirstNode() {
        queue.add(1);
        assertEquals(1, queue.peek());
    }

    @Test
    void shouldVerifyEmpty() {
        assertTrue(queue.isEmpty());
        queue.add(1);
        assertFalse(queue.isEmpty());
    }
}