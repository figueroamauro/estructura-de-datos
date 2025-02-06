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

}