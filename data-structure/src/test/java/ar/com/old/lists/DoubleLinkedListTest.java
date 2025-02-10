package ar.com.old.lists;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoubleLinkedListTest {
    DoubleLinkedList<Integer> list;

    @BeforeEach
    void init() {
        list = new DoubleLinkedList<>();
    }

    @Test
    void shouldCreateList() {
        list = new DoubleLinkedList<>();
        assertNotNull(list);
        assertNull(list.getHead());
        assertNull(list.getTail());
    }

    @Test
    void shouldAddToStart() {
        list.addHead(3);
        assertEquals(3, list.getHead().data);
        list.addHead(4);
        assertEquals(4,list.getHead().data);
        assertEquals(3, list.getTail().data);
    }

    @Test
    void shouldAddToTail() {
        list.addTail(4);
        assertEquals(4, list.getTail().data);
        list.addTail(5);
        assertEquals(5, list.getTail().data);
        assertEquals(4, list.getHead().data);
    }

    @Test
    void shouldReturnListSize() {
        list.addHead(4);
        list.addHead(5);
        assertEquals(2, list.size());
    }

    @Test
    void shouldReturnIsEmpty() {
        assertTrue(list.isEmpty());
        list.addTail(4);
        assertFalse(list.isEmpty());
    }

    @Test
    void shouldRemoveTail() {
        list.addHead(5);
        list.addHead(6);
        list.addHead(7);
        list.addHead(8);
        list.addHead(9);
        list.removeTail();
        assertEquals(4, list.size());
        assertEquals(6, list.getTail().data);
    }

    @Test
    void shouldRemoveHead(){
        list.addHead(5);
        list.addHead(6);
        list.addHead(7);
        list.addHead(8);
        list.addHead(9);
        list.removeHead();
        assertEquals(4, list.size());
        assertEquals(8, list.getHead().data);
        list.removeHead();
        assertEquals(7, list.getHead().data);

    }
}