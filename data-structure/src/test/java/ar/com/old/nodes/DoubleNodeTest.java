package ar.com.old.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoubleNodeTest {

    @Test
    void shouldCreateANode(){
        DoubleNode<Integer> node = new DoubleNode<>(10);
        assertNull(node.next);
        assertNull(node.prev);
        assertNotNull(node);
    }

}