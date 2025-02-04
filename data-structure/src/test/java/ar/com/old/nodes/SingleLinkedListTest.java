package ar.com.old.nodes;

import static org.junit.jupiter.api.Assertions.*;

import ar.com.old.exceptions.EmptyLinkedListException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SingleLinkedListTest {
    SingleLinkedList list = new SingleLinkedList();
    @BeforeEach
    void init() {
         list = new SingleLinkedList();
    }

    @Test
    void shouldCreateSingleLinkedList() {
        assertNotNull(list);
        assertNull(list.head);
        assertEquals(0, list.size);
    }

    @Test
    void shouldAddNode() {
        list.add(1);
        assertEquals(1, list.head.value);
        assertEquals(1, list.size);
    }

    @Test
    void shouldRemoveNode() {
        completeList();
        list.remove(2);
        assertEquals(2, list.size);
    }

    @Test
    void shouldThrowExceptionRemovingNode_withEmptyList(){
    Exception exception =assertThrows(EmptyLinkedListException.class, () -> list.remove(1));
    assertEquals("La lista esta vacia", exception.getMessage());
    }

    @Test
    void shouldVerifyIfNodeExists() {
        completeList();
        assertTrue(list.contains(1));
        assertTrue(list.contains(2));
        assertTrue(list.contains(3));
        assertFalse(list.contains(4));
    }

    private void completeList() {
        list.add(1);
        list.add(2);
        list.add(3);
    }
}
