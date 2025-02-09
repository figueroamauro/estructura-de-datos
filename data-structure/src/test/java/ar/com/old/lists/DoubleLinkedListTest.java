package ar.com.old.lists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoubleLinkedListTest {

    @Test
    void shouldCreateList() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        assertNotNull(list);
        assertNull(list.getHead());
        assertNull(list.getTail());
    }

    @Test
    void shouldAddToStart() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.addHead(3);
        assertEquals(3, list.getHead().data);
        list.addHead(4);
        assertEquals(4,list.getHead().data);
        assertEquals(3, list.getTail().data);
    }

    @Test
    void shouldAddToTail() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.addTail(4);
        assertEquals(4, list.getTail().data);
        list.addTail(5);
        assertEquals(5, list.getTail().data);
        assertEquals(4, list.getHead().data);
    }
}