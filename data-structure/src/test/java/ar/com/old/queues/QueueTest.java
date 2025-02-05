package ar.com.old.queues;

import ar.com.old.exceptions.EmptyQueueException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {

    @Test
    void shouldAddNodeToTail(){
        Queue queue = new Queue();
        queue.add(1);
        assertEquals(1, queue.last.value);
        queue.add(3);
        assertEquals(3, queue.last.value);
    }

    @Test
    void shouldRemoveFirstNode() {
        Queue queue = new Queue();
        queue.add(1);
        queue.add(3);
        assertEquals(1, queue.first.value);
        queue.remove();
        assertEquals(3, queue.first.value);
    }

    @Test
    void shouldThrowException() {
        Queue queue = new Queue();
        Exception exception = assertThrows(EmptyQueueException.class,queue::remove);
        assertEquals("La cola esta vacia", exception.getMessage());
    }
}