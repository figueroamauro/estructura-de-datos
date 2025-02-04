package ar.com.old.nodes;

import static org.junit.jupiter.api.Assertions.*;

import ar.com.old.exceptions.EmptyLinkedListException;
import org.junit.jupiter.api.Test;

public class SingleLinkedListTest {

    @Test
    void shouldCreateSingleLinkedList() {
        SingleLinkedList list = new SingleLinkedList();
        assertNotNull(list);
        assertNull(list.head);
        assertEquals(0, list.size);
    }

    @Test
    void shouldAddNode() {
        SingleLinkedList list = new SingleLinkedList();
        list.add(1);
        assertEquals(1, list.head.value);
        assertEquals(1, list.size);
    }

    @Test
    void shouldRemoveNode() {
        SingleLinkedList list = new SingleLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.remove(2);
        assertEquals(2, list.size);
    }

    @Test
    void shouldThrowExceptionRemovingNode_withEmptyList(){
    SingleLinkedList list = new SingleLinkedList();
    Exception exception =assertThrows(EmptyLinkedListException.class, () -> list.remove(1));
    assertEquals("La lista esta vacia", exception.getMessage());
    }
}
