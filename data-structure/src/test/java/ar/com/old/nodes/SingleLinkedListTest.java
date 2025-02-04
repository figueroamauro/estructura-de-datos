package ar.com.old.nodes;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SingleLinkedListTest {

    @Test
    void shouldCreateSingleLinkedList() {
        SingleLinkedList list = new SingleLinkedList();
        assertNotNull(list);
        assertNull(list.head);
        assertEquals(0, list.size);

    }
}
