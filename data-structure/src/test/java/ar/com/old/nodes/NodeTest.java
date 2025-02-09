package ar.com.old.nodes;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class NodeTest {

    @Test
    void shouldCreateNode() {
        Node node = new Node(1);
        assertEquals(1, node.data);
        assertNotNull(node);
    }

    @Test
    void shouldSetNullNextNode_whenNodeIsCreated() {
        Node node = new Node(1);
        assertNull(node.next);
    }
}
